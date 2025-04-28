package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Programa {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DB.getConnection();
			ps = con.prepareStatement(
					"insert into seller" +
					"(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
					"values" +
					"(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS
					);
			ps.setString(1, "Paula Nakama");
			ps.setString(2, "paulanakama@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/2001").getTime()));
			ps.setDouble(4, 2949.90);
			ps.setInt(5, 3);
			
			/*
			 ps = con.prepareStatement(
					"insert into department (Name) values ('d1'),('d2')",
					Statement.RETURN_GENERATED_KEYS
					);
			*/
			
			int linhasAfetadas = ps.executeUpdate();
			if(linhasAfetadas > 0) {
				ResultSet rs =  ps.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("sucesso, linhas afetadas: " + linhasAfetadas + " id: " + id);
				}
			}else {
				System.out.println("nenhuma linha alterada");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatment(ps);
			DB.closeConnection();
		}
	}
}