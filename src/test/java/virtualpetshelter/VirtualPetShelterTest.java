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
}
