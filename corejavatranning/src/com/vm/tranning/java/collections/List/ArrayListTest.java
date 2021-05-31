package com.vm.tranning.java.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
List<Object> arraylist = new ArrayList<Object>();
arraylist.add("Kedari");
arraylist.add(Float.valueOf(10));
arraylist.add(new Integer(1000));
System.out.println(arraylist.get(1));
System.out.println(arraylist.get(2));

}
}