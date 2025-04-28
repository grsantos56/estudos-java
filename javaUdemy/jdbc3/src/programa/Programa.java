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
					"insert into department (Name) values ('d1'),('d2')",
					Statement.RETURN_GENERATED_KEYS
					);
			
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
		}finally {
			DB.closeStatment(ps);
			DB.closeConnection();
		}
	}
}