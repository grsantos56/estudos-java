package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Programa {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DB.getConnection();
			st = con.prepareStatement(
					"UPDATE seller " + 
					"SET BaseSalary = BaseSalary + ? " +
					"WHERE " +
					"(DepartmentId = ?)");
			st.setDouble(1, 200);
			st.setInt(2, 2);
			
			int linhasAfetadas = st.executeUpdate();
			
			System.out.println("sucesso! linhas afetadas: " + linhasAfetadas);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}