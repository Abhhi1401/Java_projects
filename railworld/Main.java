package com.railworld;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		
		String name =scn.nextLine();
		
		System.out.println("Enter Gender : ");
		
		String gender = scn.nextLine();
		
		System.out.println("Enter No of legs :");
		
		int no_oflegs =scn.nextInt();
		
		scn.nextLine();
		
		System.out.println("Enter colour :");
		String colour=scn.nextLine();
		
		Animal a1 = new Animal();
		
		a1.setColour(colour);
		a1.setGender(gender);
		a1.setName(name);
		a1.setNo_oflegs(no_oflegs);
		
		System.out.println(a1);
	}

}
