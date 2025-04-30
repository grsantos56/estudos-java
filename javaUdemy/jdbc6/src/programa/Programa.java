package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBIntregatyException;
import db.DbException;

public class Programa {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = DB.getConnection();
			
			con.setAutoCommit(false);
			
			st = con.createStatement();
			
			int linhas = st.executeUpdate("update seller SET BaseSalary = 2090 where departmentId = 1");
			
			/*int x = 1;
			if(x<2) {
				throw new SQLException("erro falso");
			}*/
			
			int linhas2 = st.executeUpdate("update seller SET BaseSalary = 3090 where departmentId = 2");
			
			con.commit();
			
			System.out.println("linha1: " + linhas);
			System.out.println("linha2: " + linhas2);
			
		}catch(SQLException e) {
			try {
				con.rollback();
				throw new DbException("transação voltada. Causa: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao tentar rollback. Causa: " + e1.getMessage());
			}
		}finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}
}