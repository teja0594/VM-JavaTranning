package com.vm.tranning.java.IO.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) throws Exception {
	
	AEmployee e = new AEmployee(12,"Teja");
	//Serialization-------------------------------------------------------------------
	FileOutputStream fos = new FileOutputStream("D:/Teja/Desktop/Teja/Emp.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e);
	oos.flush();
	oos.close();
	fos.flush();
	fos.close();
	//DeSerialization-------------------------------------------------------------------
	FileInputStream fis = new FileInputStream("D:/Teja/Desktop/Teja/Emp.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object e1 = ois.readObject();
	System.out.println(e1);
	ois.close();
	fis.close();

	
	
	
}
}