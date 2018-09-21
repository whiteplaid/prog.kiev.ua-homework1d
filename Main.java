package com.homework.phone;

public class Main {

	public static void main(String[] args) {
		Network net = new Network();
		Phone my = new Phone("+380976434407",net);
		Phone my1 = new Phone("+380972743308",net);
		Phone my2 = new Phone("+380971002406",net);
		my.reg();
		my1.reg();
		my2.reg();
		net.print();
		my.call("+380972743309");
		my.call("+380971002406");
		
	}

}
