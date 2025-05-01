package programa;

import dao.DaoFactory;
import dao.SellerDao;
import entidades.Seller;

public class Programa {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
	}
}