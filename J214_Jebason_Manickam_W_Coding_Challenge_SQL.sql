create database javacoding;
use javacoding;

Select * from Pet;
-- Drop table Pet;

CREATE TABLE Pet (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255)
);


CREATE TABLE Dog (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255),
    dogBreed VARCHAR(255)
);

CREATE TABLE Cat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255),
    Catcolor VARCHAR(255)
);
create table ItemDonation(
donorName varchar(255), amount double, itemType varchar(255));
create table Donation(
	donorName varchar(255), amount double);
INSERT INTO Pet (name, age, breed) VALUES
('A', 1, 'Retriever'),
('B', 2, 'Golden Retriever'),
('Charlie', 4, 'Beagle'),
('Lucy', 5, 'Poodle');

INSERT INTO Dog (name, age, breed, dogBreed) VALUES
('A', 1, 'Retriever', 'Golden Labrador'),
('B', 2, 'Golden Retriever', ' German Shepherd'),
('C', 3, 'Pomerian', 'Alaskan Husky');

INSERT INTO Cat (name, age, breed, Catcolor) VALUES
('Whiskers', 1, 'Persian', 'Black'),
('Mittens', 2, 'Siamese', 'Brown'),
('Shadow', 3, 'Maine Coon', 'Gray');

Select * from ItemDonation;
Select * from Donation;