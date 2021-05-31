package com.vm.tranning.java.newjava8Features.StreamAPI.ProductAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductStore {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
      ArrayList<Product> products;
      ProductStorage ps = new ProductStorage();
      products=(ArrayList<Product>) ps.wareHouse();
      ProductFilters pf = new ProductFilters(products);
  
      boolean repeat = true;
      while(repeat)
      {
    	  switch(printMenu())
    	  {
    	  case 1:
    		  pf.productCount();
    		  break;
    	  case 2:
    		  System.out.print("Enter Catagery: ");
    		  String cat=sc.next();
    		  pf.productCatogery(cat);
    		  break;
    	  case 3:
    		  System.out.print("Enter min price: ");
    		  int minp=sc.nextInt();
    		  System.out.print("Enter max price: ");
    		  int maxp = sc.nextInt();
    		  pf.productPriceRange(minp, maxp);
    		  break;
    	  case 4:
    		  pf.productpricegreater(4000);
    		  break;
    	  case 5:
    		  System.out.print("Sort by:(name/price): ");
    		  String sor =sc.next();
    		  pf.productSort(sor);
    		  
    		  break;
    	  case 6:
    		  System.out.print("Enter Quantity: ");
    		  int quant = sc.nextInt();
    		  System.out.print("Enter Catogery: ");
    		  String catog = sc.next();
    		  pf.productCustomQuery(quant,catog);
    		  break;
    	  case 7:
    		  pf.productNameUpperCase();
    		  break;
    	  case 8:
    		  System.out.print("Enter Catogery: ");
    		  String cato = sc.next();
    		  pf.productCountCatogery(cato);
    		  break;
    	  case 9:
    		  repeat=false;
    		  System.out.println("Visit again ._.");
    		  break;
    		  
    	  }
      }
      
	
}
private static int printMenu()
{
    System.out.println("_____________Welcome to Store_______________\n");
	System.out.println("1. Product Count");
	System.out.println("2. Product by Catagery");
	System.out.println("3. Product by Price range ");
	System.out.println("4. Product by Price");
	System.out.println("5. Sort Products");
	System.out.println("6. Product by Custom Query");
	System.out.println("7. UpperCase ProductNames");
	System.out.println("8. Product Count by Catogery");
	System.out.println("9. Exit");
	  System.out.println("__________________________________________");
	return sc.nextInt();
}
}
