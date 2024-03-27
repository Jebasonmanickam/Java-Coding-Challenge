package controller;

import java.util.ArrayList;

import java.util.List;

import entity.Pet;

public class Controller implements AInterface  {
	private List<Pet> availablePets;
	public Controller() {
        availablePets = new ArrayList<>();
    }

	
	public void addPet(Pet pet) {
		// TODO Auto-generated method stub
	        availablePets.add(pet);
	        System.out.println("Pet added Successfully: " + pet.toString());
	    }

	
	public void removePet(Pet pet) {
		// TODO Auto-generated method stub
		availablePets.remove(pet);
        System.out.println("Pet removed successfully: " + pet.toString());
    }
	

	
	public void listAvailablePets() {
		// TODO Auto-generated method stub
		
		if (availablePets.isEmpty()) {
            System.out.println("No pets available right now.");
        } else {
            System.out.println("Pets Available :");
            for (Pet pet : availablePets) {
                System.out.println(pet);
            }
        }
		
	}

	@Override
	public void recordDonation() {
		
	}
	public void recordItemDonation() {
		
	}
	public void adoptevent() {
		
	}


	
	

}