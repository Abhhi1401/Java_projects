package com.railworld;

public class Animal {
	
	public String name;
	
	public String gender;
	
	public int no_oflegs;
	
	public String colour;

	public Animal(String name, String gender, int no_oflegs, String colour) {
		super();
		this.name = name;
		this.gender = gender;
		this.no_oflegs = no_oflegs;
		this.colour = colour;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNo_oflegs() {
		return no_oflegs;
	}

	public void setNo_oflegs(int no_oflegs) {
		this.no_oflegs = no_oflegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", gender=" + gender + ", no_oflegs=" + no_oflegs + ", colour=" + colour + "]";
	}
	
	

}
