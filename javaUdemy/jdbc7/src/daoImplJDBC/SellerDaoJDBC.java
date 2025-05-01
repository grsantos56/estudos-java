package daoImplJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.SellerDao;
import db.DB;
import db.DbException;
import entidades.Department;
import entidades.Seller;

public class SellerDaoJDBC implements SellerDao{

	private Connection con;
	public SellerDaoJDBC(Connection con) {
		this.con = con;
	}
	
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(
					"SELECT seller.*, department.Name as DepName " +
					"FROM seller INNER JOIN department " +
					"ON seller.DepartmentId = department.Id " +
					"WHERE seller.Id = ? ");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				Department dep = new Department();
				
				dep.setId(rs.getInt("DepartmentId"));
				dep.setName(rs.getString("DepName"));
				
				Seller obj = new Seller();
				
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setBirthDate(rs.getDate("BirthDate"));
				obj.setDepartment(dep);
				return obj;
			}
			return null;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatment(ps);
			DB.closeResultSet(rs);
		}
		

	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
