package com.homework.phone;

public class Phone {
	private String number;
	private Network network;
	

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
		
		Boolean isChecked = false;
		for (int i = 0; i < network.getTelNumbers().length; i++) {
			if (network.getTelNumbers()[i] != null) {
			if(network.getTelNumbers()[i].equals(caller)) {
				isChecked = true;
			}
			}
		}
		if (isChecked) {
			System.out.println("Calling " + caller);
		} else {
			System.out.println("There is no registered phone " + caller + " on this Network");
		}
	}


	
}
