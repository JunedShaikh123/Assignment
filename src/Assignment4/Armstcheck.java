package Assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Armstcheck {

	@Test
	void test() {
		boolean ans= true;
		boolean ans2= false ;
		
		assertEquals(ans, Armstrong.isArmstrong(2));
	}

}
