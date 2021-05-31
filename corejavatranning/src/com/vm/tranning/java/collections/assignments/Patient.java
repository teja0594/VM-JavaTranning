package com.vm.tranning.java.collections.assignments;

public class Patient implements Comparable<Patient> {

	private int patientId;
	private String name;
	private int age;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Patient o) {
	
		if(this.getPatientId()>o.getPatientId())
			return 1;
		else
			return -1;
	}
}
