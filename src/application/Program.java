package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department d = new Department(1, "games");
		
		Seller s = new Seller(247, "knight", "hollow@teamcherry.com", new Date(), 247.0, d);
		System.out.println(s);
	}

}