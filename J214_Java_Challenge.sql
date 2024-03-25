create database javacoding1;
use javacoding1;

CREATE TABLE Pet (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    Age INT,
    Breed VARCHAR(255),
    Type ENUM('Dog', 'Cat')
);

-- Dog table (inherits from Pet)
CREATE TABLE Dog (
    PetID INT PRIMARY KEY,
    DogBreed VARCHAR(255),
    FOREIGN KEY (PetID) REFERENCES Pet(ID)
);

-- Cat table (inherits from Pet)
CREATE TABLE Cat (
    PetID INT PRIMARY KEY,
    CatColor VARCHAR(255),
    FOREIGN KEY (PetID) REFERENCES Pet(ID)
);

INSERT INTO Pet (Name, Age, Breed, Type) VALUES 
('Buddy', 3, 'Labrador', 'Dog'),
('Whiskers', 2, 'Persian', 'Cat'),
('Max', 5, 'German Shepherd', 'Dog'),
('Smokey', 4, 'Maine Coon', 'Cat'),
('Rocky', 2, 'Golden Retriever', 'Dog'),
('Mittens', 3, 'Siamese', 'Cat'),
('Bella', 4, 'Poodle', 'Dog'),
('Oreo', 1, 'British Shorthair', 'Cat'),
('Charlie', 2, 'Dachshund', 'Dog'),
('Luna', 3, 'Ragdoll', 'Cat');


INSERT INTO Dog (PetID, DogBreed) VALUES 
(1, 'Golden Retriever'),
(12, 'German Shepherd'),
(5, 'Labrador'),
(7, 'Poodle'),
(9, 'Dachshund');


INSERT INTO Cat (PetID, CatColor) VALUES 
(2, 'White'),
(11, 'Black'),
(6, 'Grey'),
(8, 'Tabby'),
(10, 'Calico');