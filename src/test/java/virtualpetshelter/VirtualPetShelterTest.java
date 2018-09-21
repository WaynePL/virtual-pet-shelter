package virtualpetshelter;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test

	public void shouldGetName() {
		VirtualPetShelter undertest = new VirtualPetShelter();
		String actual = undertest.getPetName();

		Assert.assertEquals("Tommy", actual);
	}

	@Test

	public void shouldGetDescription() {
		VirtualPetShelter undertest = new VirtualPetShelter();
		String actual = undertest.getPetDesc();

		Assert.assertEquals("Hungry", actual);
	}

	@Test
	public void shouldIncreaseHunger() {
		VirtualPet undertest = new VirtualPet("tommy", "hungry");
		undertest.tick();
		int actual = undertest.hunger;
		Assert.assertEquals(10, actual);
	}
}
