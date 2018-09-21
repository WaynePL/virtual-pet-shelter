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
}
