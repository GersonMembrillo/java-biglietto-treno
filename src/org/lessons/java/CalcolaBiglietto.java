package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ticket Generator (NON per raccogliere i tuoi dati!)\n");
		
		System.out.print("Nome?: ");
		String name = sc.nextLine();
		
		System.out.print("Cognome?: ");
		String lastname = sc.nextLine();
		
		System.out.print("Età?:  ");
		int age = sc.nextInt();
		
		System.out.print("Distanza(km)?:  ");
		int distance = sc.nextInt();
		
		System.out.println("\n--------------------\n");
		System.out.println("IL TUO BIGLIETTO:\n");
		
		double discount = 1.0;
		
			if (age >= 0 && age <= 17) {
	            discount = 0.8;
	        } else if (age >= 65) {
	            discount = 0.6;
	        }
		
		double total = (distance * 0.21) * discount;
		
		System.out.println("Nome passeggero: " + name + " " + lastname );
		System.out.printf("Prezzo biglietto: € " + "%.2f", total);

		
	}

}
