package dao;
import entity.Pet;
import java.util.Scanner;
import entity.PetShelter;

public class Methods {
	static Scanner sc = new Scanner(System.in);
	
	
	public static Pet addPet() {
		System.out.print("Enter Name");
		String name = sc.next();
		System.out.print("Enter Age");
		Integer age = sc.nextInt();
		System.out.print("Enter Breed");
		String breed = sc.next();
		
		return new Pet(name, age, breed);
	}
	
		
}

