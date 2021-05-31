package com.vm.tranning.java.assignments;
class Arithmetic {
    int add(int a, int b) {
        return  a+b;
    }
}
class Adder extends Arithmetic {}
public class  Assignment23{
    public static void main(String []args){
        Adder add = new Adder();
        System.out.println("My superclass is: Arthmetic");	
        System.out.print(add.add(20,20));
     }  }
