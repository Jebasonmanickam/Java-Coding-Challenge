package entity;

import java.util.ArrayList; 
import java.util.List;
public class PetShelter {
    private List<Pet> availablePets;

    public PetShelter() {
        availablePets = new ArrayList<>();
    }

    // Add a pet to the shelter
    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    // Remove a pet from the shelter
    public void removePet(Pet pet) {
        availablePets.remove(pet);
    }

    // List all available pets
    public void listAvailablePets() {
        for (Pet pet : availablePets) {
            System.out.println(pet.toString());
        }
    }
}
