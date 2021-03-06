package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		VirtualPetShelter petShelter = new VirtualPetShelter();
		petShelter.createPet("Tommy", "Calico cat. Constantly purring.", 30, 10, 50);
		petShelter.createPet("Charles", "Beagle. Howls a lot.", 60, 40, 20);
		petShelter.createPet("Minnie", "Chocolat lab. Will do anything for attention.", 0, 20, 70);
		petShelter.createPet("Freddie", "Coy fish. Follows your movements.", 50, 0, 10);

		System.out.println("Welcome to back to the shelter.");
		System.out.println();
		while (!quit) {

			displayStatusAndOptions(petShelter);
			String choiceString = input.nextLine();
			int choice = 0;
			try {
				choice = Integer.parseInt(choiceString);
			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again");
				continue;
			}

			switch (choice) {
			case 1:
				petShelter.feedAllPets();
				break;
			case 2:
				petShelter.hydrateAllPets();
				break;
			case 3:
				playWithPet(input, petShelter);
				break;
			case 4:
				adopt(input, petShelter);
				break;
			case 5:
				admitPet(input, petShelter);
				break;
			case 6:
				quit = true;
				continue;
			}
			petShelter.tick();
		}
		input.close();
		System.out.println("Thanks for volunteering!");
	}

	private static void adopt(Scanner input, VirtualPetShelter petShelter) {
		System.out.println("Choose which pet you would like to adopt.");
		System.out.println();
		displayPetNamesAndDescriptions(petShelter);
		System.out.println("Enter the name of the pet you would like to adopt.");
		String name = input.nextLine();
		System.out.println();
		System.out.println("You adopt " + name + ". Have fun!");
		petShelter.adoptPet(name);
	}

	private static void playWithPet(Scanner input, VirtualPetShelter petShelter) {
		System.out.println("Choose which pet you would like to play with.");
		System.out.println();
		displayPetNamesAndDescriptions(petShelter);
		System.out.println("Enter the name of the pet you would like to play with.");
		String name = input.nextLine();
		System.out.println();
		System.out.println("You play with " + name);
		petShelter.play(name);
	}

	private static void displayPetNamesAndDescriptions(VirtualPetShelter petShelter) {
		for (VirtualPet pet : petShelter.getPets()) {
			System.out.println("[" + pet.name + "] " + pet.description);
		}
	}

	private static void admitPet(Scanner input, VirtualPetShelter petShelter) {
		System.out.println("Thank you for bringing your pet.");
		System.out.println("What is your pet's name?");
		String name = input.nextLine();
		System.out.println("Please describe your pet.");
		String desc = input.nextLine();
		System.out.println("We will take good care of " + name + ".");
		petShelter.createPet(name, desc);
	}

	private static void displayStatusAndOptions(VirtualPetShelter petShelter) {
		System.out.println("Here is the status of our guests:");
		System.out.println();
		System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
		System.out.println("--------------------------------");
		for (VirtualPet pet : petShelter.getPets()) {
			System.out.println(pet.name + "\t|" + pet.hunger + "\t|" + pet.thirst + "\t|" + pet.boredom);
		}
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Feed the pets");
		System.out.println("2. Hydrate the pets");
		System.out.println("3. Play with a pet");
		System.out.println("4. Adopt a pet");
		System.out.println("5. Admit a pet");
		System.out.println("6. Quit");
		System.out.println();
	}
}
