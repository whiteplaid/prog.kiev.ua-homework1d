package com.homework.phone;

public class Phone {
	private String number;
	private Network network;
	//private String caller;

	public Phone(String number, Network network) {
		super();
		this.number = number;
		this.network = network;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void reg () {
		
		network.addNumber(number);
		
	}
	public void call(String caller) {
		if(network.getTelNumbers().contains(caller)) {
			System.out.println("Calling " + caller);
		} else {
			System.out.println("There is no registered phone " + caller + " on this Network");
		}
	}


	
}
