package Assignment9;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals("This  Red car",RemoveCase.check("This @ Red $car-"));
	}

}
