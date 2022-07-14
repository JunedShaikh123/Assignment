package Assignment3;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals("junedshaikh2812@gmail.com",Email.email("junedshaikh2812@gmail.com"));
		assertEquals("juned@1234",Email.email("juned@1234"));
	}

}
