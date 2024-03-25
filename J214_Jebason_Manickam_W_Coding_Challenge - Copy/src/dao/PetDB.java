package dao;

import java.sql.*;
import util.DBConnection;
import entity.Pet;

public class PetDB {
	private static Connection conn = DBConnection.getDBConnection();

	//*******************************************************************************
	
	
	public static void insertPet(Pet pet) {
		try {
			String query = "INSERT INTO COURIER VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, Pet.getName());
			ps.setInt(2, Pet.getAge());
			ps.setString(3, Pet.getBreed());
			System.out.println("Pet added successfully!");
			int numberOfRows = ps.executeUpdate();
			System.out.println(numberOfRows + " ROW INSERTED SUCCEDSSFULLY");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}