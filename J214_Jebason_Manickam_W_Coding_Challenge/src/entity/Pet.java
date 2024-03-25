package entity;

public class Pet {
    private static String name;
    private static int age;
    private static String breed;

    public Pet(String name, int age, String breed) {
        Pet.name = name;
        Pet.age = age;
        Pet.breed = breed;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Pet.name = name;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        Pet.age = age;
    }

    public static String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        Pet.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }
}