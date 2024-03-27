package main;
import java.sql.SQLException;


import java.util.List;
import java.util.Scanner;

import dao.Methods;
import exception.InvalidPetAgeHandlingException;
import entity.Donation;
import entity.ItemDonation;
import entity.Pet;
import entity.AdoptionEvent;

public class MainClass {
    public static void main(String[] args) throws SQLException, InvalidPetAgeHandlingException {
        Scanner scanner = new Scanner(System.in);
        Methods md = new Methods();
       

        int choice = 0; 

        do {
            System.out.println("Welcome. Select your Choice:");
            System.out.println("1. Add a Pet");
            System.out.println("2. Remove a Pet");
            System.out.println("3. List available Pets");
            System.out.println("4. Record Cash Donation");
            System.out.println("5. Record Item Donation");
            
            
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter pet details:");
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Breed: ");
                        String breed = scanner.nextLine();

                        
                        Pet pet = new Pet(name, age, breed);

                       
                        md.addPet(pet);
                        System.out.println("Pet added successfully!");
                        break;

                        

                    case 2:
                 
                        System.out.println("Enter the name of the pet to remove:");
                        String petNameToRemove = scanner.nextLine();

                        // Call a method from PetShelterDao to remove the specified pet
                        md.removePet(petNameToRemove);
                        
                        System.out.println("Pet '" + petNameToRemove + "' has been removed.");
                        break;

                        

                       
                    case 3:
                    
                        List<Pet> availablePets = md.listAvailablePets();

                        if (availablePets.isEmpty()) {
                            System.out.println("No pets are currently available for adoption.");
                        } else {
                            System.out.println("Available Pets:");
                            for (Pet pet1 : availablePets) {
                                System.out.println("Name: " + pet1.getName() + ", Age: " + pet1.getAge() + ", Breed: " + pet1.getBreed());
                            }
                        }
                        break;

                       
                    case 4:
                        System.out.print("Enter the donor's name: ");
                        String donorName = scanner.nextLine();
                        System.out.print("Enter the amount of cash donation: $");
                        double cashDonationAmount = Double.parseDouble(scanner.nextLine());

                        
                        Donation cashDonation = new Donation(donorName, cashDonationAmount);

                        try {
                            
                            md.recordDonation(cashDonation);
                            System.out.println("Cash donation recorded successfully!");
                        } catch (SQLException e) {
                            System.out.println("Error recording cash donation: " + e.getMessage());
                        }
                        break;

                    case 5:
                        System.out.print("Enter the donor's name: ");
                        String donorName1 = scanner.nextLine();
                        
                        System.out.print("Enter the quantity donated: ");
                        int amount = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter the donated item name: ");
                        String itemType = scanner.nextLine();

                        
                        ItemDonation itemDonation = new ItemDonation(donorName1,amount, itemType);

                        try {
                            
                            md.recordItemDonation(itemDonation);
                        } catch (SQLException e) {
                            System.out.println("Error recording item donation: " + e.getMessage());
                        }
                        break;
                    
                    	

                        
                      
                    case 6:
                        System.out.println("THANK YOU.!!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter between 1 to 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}