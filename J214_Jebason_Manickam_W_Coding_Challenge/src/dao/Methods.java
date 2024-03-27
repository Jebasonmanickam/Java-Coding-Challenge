package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.AdoptionEvent;
import entity.Donation;
import entity.ItemDonation;
import entity.Pet;
import util.DBConnection;
import exception.InvalidPetAgeHandlingException;
public class Methods {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	public void addPet(Pet pet) throws InvalidPetAgeHandlingException, SQLException {
		con = DBConnection.getDBConn();
        String query = "INSERT INTO pet (name, age, breed) VALUES (?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, pet.getName());
            statement.setInt(2, pet.getAge());
            statement.setString(3, pet.getBreed());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("New pet added!");
            }
        }
    }
	public void removePet(String name) throws SQLException {
		con = DBConnection.getDBConn();
        String query = "DELETE FROM pet WHERE name = ?";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, name);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Pet removed successfully!");
            }
        }
    }
	public List<Pet> listAvailablePets() throws SQLException {
		con = DBConnection.getDBConn();
        List<Pet> availablePets = new ArrayList<>();
        String query = "SELECT * FROM pet ";
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Pet pet = new Pet(resultSet.getString("name"), resultSet.getInt("age"), resultSet.getString("breed"));
                pet.setName(resultSet.getString("name"));
                pet.setAge(resultSet.getInt("age"));
                pet.setBreed(resultSet.getString("breed"));
                availablePets.add(pet);
            }
        }
        return availablePets;
    }
	public void recordDonation(Donation donation) throws SQLException {
	    con = DBConnection.getDBConn();
	    String query = "INSERT INTO donation (DonorName, amount) VALUES (?, ?)";
	    try (PreparedStatement statement = con.prepareStatement(query)) {
	        statement.setString(1, donation.getDonorName());
	        statement.setDouble(2, donation.getAmount());
	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("Donation recorded successfully!");
	        }
	    }
	}
	public void recordItemDonation(ItemDonation itemDonation) throws SQLException {
        con = DBConnection.getDBConn();
        String query = "INSERT INTO ItemDonation (DonorName, amount, itemType) VALUES (?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, itemDonation.getDonorName());
            statement.setDouble(2, itemDonation.getAmount());
            statement.setString(3, itemDonation.getItemType());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Item donation recorded successfully!");
            }
        }
    }
	public void adoptEvent(AdoptionEvent event) throws SQLException {
        con = DBConnection.getDBConn();
        String query = "INSERT INTO AdoptionEventt (eventid, eventname, evendate,eveloc) VALUES (?,?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {
        	
            statement.setString(1, event.getEvename());
            statement.setDate(2, event.getEvendate());
            statement.setString(3, event.getEveloc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Adoption event added successfully!");
            }
        }
    }


}