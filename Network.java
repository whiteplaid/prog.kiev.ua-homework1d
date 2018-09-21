package com.homework.phone;
import java.util.ArrayList;
public class Network {
	private  ArrayList<String> telNumbers = new ArrayList<String>();
	



	public Network(ArrayList<String> telNumbers) {
		super();
		this.telNumbers = telNumbers;
	}

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getTelNumbers() {
		return telNumbers;
	}

	public void setTelNumbers(ArrayList<String> telNumbers) {
		this.telNumbers = telNumbers;
	}

	public void addNumber (String one) {
		Boolean isFounded = false;

		if (telNumbers.contains(one)) {
			isFounded = true;
		}
		if (!isFounded) {
			telNumbers.add(one);
			
		}
		
	}

	public void print () {

			System.out.println("Registered phones: " + telNumbers);

		
	}
	
}
