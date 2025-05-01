package dao;

import daoImplJDBC.SellerDaoJDBC;
import db.DB;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
