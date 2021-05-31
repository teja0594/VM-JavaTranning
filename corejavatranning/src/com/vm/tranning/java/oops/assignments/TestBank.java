package com.vm.tranning.java.oops.assignments;

public class TestBank {
	public static void main(String[] args) {
		Bank i1 = new UnionBank();
		Bank i2 = new PaytmBank();
		Bank i3 = new ICICIBank();
		System.out.println(i1.Interestrate());
		System.out.println(i2.Interestrate());
		System.out.println(i3.Interestrate());
	}
}
