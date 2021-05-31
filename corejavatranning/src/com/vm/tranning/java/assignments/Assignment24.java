package com.vm.tranning.java.assignments;
import java.util.Scanner;
abstract class Book {	
	String title;
	abstract void setTitle(String s);
	String getTitle(){
	return title;
	}
}
class MyBook extends Book {
void setTitle(String s) {
	super.title=s;
}
}
public class Assignment24{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ="";
	s+=sc.nextLine();
MyBook mybook=new MyBook();
mybook.setTitle(s);
System.out.println("The Title is: "+mybook.getTitle());
}
}
