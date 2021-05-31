package com.vm.tranning.java.newjava8Features.StreamAPI.ProductAssignment;

import java.util.ArrayList;

public class ProductStorage {
	ArrayList<Product>products = new ArrayList<Product>();

	public ArrayList<Product> wareHouse()
	{
		Product[] product = new Product[12];
		for(int i=0;i<12;i++)
		{
			product[i]= new Product();
		}
		
		product[0].setPid(900501);product[0].setCategory("Electronics");product[0].setPname("Samsung Galaxy S21 Ultra");product[0].setPrice(107000.0);product[0].setQuantity(5);
		product[1].setPid(900301);product[1].setCategory("Clothes");product[1].setPname("Levis Sky Blue Shirt");product[1].setPrice(699.0);product[1].setQuantity(9);
		product[2].setPid(900302);product[2].setCategory("Clothes");product[2].setPname("Allen Solly Dark Jeans");product[2].setPrice(1599.0);product[2].setQuantity(15);
		product[3].setPid(902001);product[3].setCategory("Toys");product[3].setPname("Rubiks Cube 5X5");product[3].setPrice(450.0);product[3].setQuantity(27);
		product[4].setPid(900601);product[4].setCategory("Furniture");product[4].setPname("Ikea Dine Table ");product[4].setPrice(124998.0);product[4].setQuantity(2);
		product[5].setPid(900801);product[5].setCategory("HouseHold");product[5].setPname("Vim Soap Bar");product[5].setPrice(50.0);product[5].setQuantity(70);
		product[6].setPid(900502);product[6].setCategory("Electronics");product[6].setPname("Lenova GT47 SSD Laptop");product[6].setPrice(65000.0);product[6].setQuantity(11);
		product[7].setPid(900303);product[7].setCategory("Clothes");product[7].setPname("Calvin Klein Short L");product[7].setPrice(499.0);product[7].setQuantity(7);
		product[8].setPid(902002);product[8].setCategory("Toys");product[8].setPname("Iron Man Mask with Laser");product[8].setPrice(2699.0);product[8].setQuantity(8);
		product[9].setPid(900602);product[9].setCategory("Furniture");product[9].setPname("Godrej Chair");product[9].setPrice(3000.0);product[9].setQuantity(15);
		product[10].setPid(900503);product[10].setCategory("Electronics");product[10].setPname("Cannon DSLR Camera with Lens");product[10].setPrice(94000.0);product[10].setQuantity(4);
		product[11].setPid(900504);product[11].setCategory("Electronics");product[11].setPname("Phillips Televison 42 inch");product[11].setPrice(56000.0);product[11].setQuantity(5);
		
		for(int i=0;i<12;i++)
		{
			products.add(product[i]);
		}
		return products;
	}
}
