package com.vm.tranning.java.newjava8Features.StreamAPI.ProductAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductFilters {

	private static Scanner sc = new Scanner(System.in);
	private ArrayList<Product> products;

	public ProductFilters(ArrayList<Product> products) {
		super();
		this.products = products;
	}
	public void productCount()
	{
		long c= products.stream().count();
		long  qc = products.stream().map(p->p.getQuantity()).reduce(0,(A,B)->A+B);
		System.out.println("Count of Products: "+c);
		System.out.println("Count of all product Quantities: "+qc);
	}
	public void productCatogery(String cat)
	{
		if(cat.equalsIgnoreCase("all"))
		{
			System.out.println();
			System.out.println("Catogery: Electronics");
			products.stream().filter(p->p.getCategory().equalsIgnoreCase("Electronics")).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));
			System.out.println("------------------------------------");
			System.out.println("Catogery: Clothes");
			products.stream().filter(p->p.getCategory().equalsIgnoreCase("Clothes")).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));
			System.out.println("------------------------------------");
			System.out.println("Catogery: Toys");
			products.stream().filter(p->p.getCategory().equalsIgnoreCase("Toys")).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));
			System.out.println("------------------------------------");
			System.out.println("Catogery: Furniture");
			products.stream().filter(p->p.getCategory().equalsIgnoreCase("Furniture")).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));
			System.out.println("------------------------------------");
			System.out.println("Catogery: HouseHold");
			products.stream().filter(p->p.getCategory().equalsIgnoreCase("HouseHold")).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));
			System.out.println("------------------------------------");	
		}
		else
		{
		    System.out.println();
			System.out.println("Catogery: "+cat);
		products.stream().filter(p->p.getCategory().equalsIgnoreCase(cat)).forEach(p->System.out.println(p.getPname()+"  "+p.getPrice()+"/-"));
		System.out.println("------------------------------------");
	}
	}
	public void productPriceRange(int min,int max)
	{
		System.out.println();
		List<String> ppr=products.stream().filter(p->p.getPrice()>=min&&p.getPrice()<=max).map(p->p.getPname()+"  "+p.getPrice()).collect(Collectors.toList());
		if(ppr.size()>0)
		{
			System.out.println("\nProducts by range "+min+" - "+max);
			System.out.println("------------------------------------");
			ppr.forEach(p->System.out.println(p));
			System.out.println();
		}	
		else
			System.out.println("no Products Found\n");
	}
	public void productpricegreater(int price)
	{
		System.out.println();
		List<String> ppr=products.stream().filter(p->p.getPrice()>price).map(p->p.getPname()+"  "+p.getPrice()).collect(Collectors.toList());
		if(ppr.size()>0)
		{
			System.out.println("\nProducts with price above "+price);
			System.out.println("------------------------------------");
			ppr.forEach(p->System.out.println(p));
			System.out.println();
		}	
		else
			System.out.println("no Products Found\n");
	}
	public void productSort(String sorttype)
	{
		if(sorttype.equalsIgnoreCase("name"))
		{
			System.out.println();
			System.out.println("Products sorted based on name:");
			System.out.println("------------------------------------");
			products.stream().sorted(Comparator.comparing(p->p.getPname())).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));
		}
		else
		{
			System.out.print("low-high/high-low: ");
			String s = sc.next();
			if(s.equalsIgnoreCase("low-high"))
			{
				System.out.println();
				System.out.println("Products sorted based on price form low to high:");
				System.out.println("------------------------------------");
				products.stream().sorted(Comparator.comparing(p->p.getPrice())).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));
			}
				else
			{
					System.out.println();
					System.out.println("Products sorted based on price form high to low:");
					System.out.println("------------------------------------");
					products.stream().sorted(Comparator.comparing(p->((Product) p).getPrice()).reversed()).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));
			}
				
				
		}
	}
	public void productCustomQuery(int quanti,String cato)
	{
		List<String> query=	products.stream().filter(p->p.getQuantity()>quanti&&p.getCategory().equalsIgnoreCase(cato)).map(p->p.getPname()+" "+p.getPrice()).collect(Collectors.toList());
		System.out.println("Product by Custom Query :");
		System.out.println("Quantity > "+quanti+" Catogery: "+cato);
		System.out.println("------------------------------------");
		query.forEach(p->System.out.println(p));
	}
	public void productNameUpperCase()
	{
	List<String> productname=	products.stream().map(p->p.getPname().toUpperCase()+" "+p.getPrice()).collect(Collectors.toList());
	System.out.println("Product Names toggle to UpperCase:");
	System.out.println("------------------------------------");
	productname.forEach(p->System.out.println(p));
	}
	public void productCountCatogery(String cat1)
	{
		long c= products.stream().filter(p->p.getCategory().equalsIgnoreCase(cat1)).count();
		long  qc = products.stream().filter(p->p.getCategory().equalsIgnoreCase(cat1)).map(p->p.getQuantity()).reduce(0,(A,B)->A+B);
		System.out.println();
		System.out.println("Count of Products in "+cat1+" Catogery: "+c);
		System.out.println("Count of all product Quantities in "+cat1+" Catogery: "+qc);
	}
	
}
