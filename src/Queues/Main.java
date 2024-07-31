package Queues;

public class Main {
    public static void main(String[] args) {
        Queues.AnimalShelter shelter = new Queues.AnimalShelter();

        // Create animals with current time as arrival time
        Cat kitten = new Cat("Kitten Oreo", "Persian cat", "Male", 3, System.currentTimeMillis());
        Cat kitty = new Cat("Kitty Honey", "Ragdoll", "Female", 7, System.currentTimeMillis() + 1);
        Dog puppy = new Dog("Pups Leloo", "Poodle", "Male", 5, System.currentTimeMillis() + 2);

        // Add animals to the shelter
        shelter.enqueue(kitten);
        shelter.enqueue(kitty);
        shelter.enqueue(puppy);

        // Print initial state
        System.out.println("Current Shelter Status:");
        shelter.printShelterList();

        // Adopt a cat
        Animal adoptedCat = shelter.dequeueCat();
        System.out.println("\nAfter adopting a cat:");
        shelter.printShelterList();

        // Adopt any animal
        Animal adoptedAny = shelter.dequeueAny();
        System.out.println("\nAfter adopting any animal:");
        shelter.printShelterList();

        // Adopt a dog
        Animal adoptedDog = shelter.dequeueDog();
        System.out.println("\nAfter adopting a dog:");
        shelter.printShelterList();

        // Print details of adopted animals
        System.out.println("\nDequeueCat: " + (adoptedCat != null ? adoptedCat.getName() + " (" + adoptedCat.getBreed() + ", " + adoptedCat.getGender() + ", " + adoptedCat.getAge() + " years old)" : "No Cat Adopted"));
        System.out.println("DequeueAny: " + (adoptedAny != null ? adoptedAny.getName() + " (" + adoptedAny.getBreed() + ", " + adoptedAny.getGender() + ", " + adoptedAny.getAge() + " years old)" : "No Animal Adopted"));
        System.out.println("DequeueDog: " + (adoptedDog != null ? adoptedDog.getName() + " (" + adoptedDog.getBreed() + ", " + adoptedDog.getGender() + ", " + adoptedDog.getAge() + " years old)" : "No Dog Adopted"));
    }
}

