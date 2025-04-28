package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DBIntregatyException;

public class Programa {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DB.getConnection();
			st = con.prepareStatement(
					"delete from department "+
					"where " +
					"Id = ?"
					);
			st.setInt(1, 2);
			
			int linhasAfetadas = st.executeUpdate();
			System.out.println("sucesso! linhas afetadas: " + linhasAfetadas);
		}catch(SQLException e) {
			throw new DBIntregatyException(e.getMessage());
		}finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}
}