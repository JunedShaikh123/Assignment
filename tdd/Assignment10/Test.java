package Assignment10;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals("apple-orange-banana-lemon",Demo.concat(new String [] {"apple","orange","banana","lemon"}));
	}

}
