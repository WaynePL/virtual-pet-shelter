package virtualpetshelter;

public class VirtualPetShelter {

	public String getPetName() {
		return "Tommy";
	}

	public String getPetDesc() {
		return "Hungry";
	}

	public void tick() {
		VirtualPet pet = new VirtualPet("tommy", "hungry");
		pet.increaseHunger();
		pet.increaseThirst();
		pet.increaseBoredom();

	}
}
