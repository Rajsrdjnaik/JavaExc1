package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;
class Exc9test {

	@Test
	public void test() {
		Exc9 obj = new Exc9();
		String c = obj.reverse("Rajat");
		assertEquals("tajaR",c);	
	}

}
