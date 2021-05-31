package com.vm.tranning.java.assignments;
class Animal{
	  void walk(){
	System.out.println("Animal is walking"); }
	}
	class Bird extends Animal {
	 void fly()
	 { 
	System.out.println("Bird is flying");
	 }
	    void sing()
	   {
	      System.out.println("Bird is singing");
	   }
	}
public class Assignment22 {
	public static void main(String[] args){ 
		Bird bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
		 } 
}
