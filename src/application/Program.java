package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("test findById");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("test findByDepartment");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s : list) {
			System.out.println(s);
		}

		System.out.println("test findAll");			
		list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("test insert");			
		Seller newSeller = new Seller(null, "garmond", "garmond@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller.getId());
	}

}