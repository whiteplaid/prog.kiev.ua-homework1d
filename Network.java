package com.homework.phone;

public class Network {
	private String[] telNumbers = new String[20];
	


	public Network(String[] telNumbers) {
		super();
		this.telNumbers = telNumbers;
	}

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getTelNumbers() {
		return telNumbers;
	}

	public void setTelNumbers(String[] telNumbers) {
		this.telNumbers = telNumbers;
	}

	public void addNumber (String one) {
		Boolean isFounded = false;
		for (int i = 0; i < telNumbers.length; i++) {
			if (telNumbers[i] != null) {
			if (telNumbers[i].equals(one)) {
				isFounded = true;
			}
		}
		}

		if (!isFounded) {
			for (int i = 0; i < telNumbers.length;i++) {
				if (telNumbers[i] == null) {
					telNumbers[i] = one;
					break;
				}
			}
			
			
		}
		
	}

	public void print () {
		System.out.println("Registered phones:");
			for (int i = 0; i < telNumbers.length;i++) {
				if (telNumbers[i] != null) 
				System.out.println(telNumbers[i]);
			}

		
	}
	
}
