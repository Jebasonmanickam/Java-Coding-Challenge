package main;
import java.util.Scanner;

import dao.Methods;

public class MainClass {
	public static void main(String[] args) {
		//Methods me = new Methods();
		Scanner sc = new Scanner(System.in);
		String ch = null;
		
		
		do {
			
			System.out.println("Choose an option to Continue: ");
			System.out.println("Enter (1) to Add pet");
			Integer choice = sc.nextInt();
		
			switch (choice) {
			case 1:
				
				Methods.addPet();
				break;
				
            default:
				
				System.out.println("Invalid choice!");
				break;
			}
			
			System.out.println("Do you want to continue? (Y/N)");
			ch = sc.next();
				
		 }
		while (ch.equalsIgnoreCase("Y"));
		System.out.println("THANK YOU!");
	  
     } 	
}
