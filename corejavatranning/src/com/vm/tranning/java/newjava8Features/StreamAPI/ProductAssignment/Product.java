package com.vm.tranning.java.newjava8Features.StreamAPI.ProductAssignment;

public class Product {
	private int pid ;
	 private String pname;
	private String  category;
	private double price;
	private int quantity;
	public Product(int pid, String pname, String category, double price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	

}
