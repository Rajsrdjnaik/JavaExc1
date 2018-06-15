package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;

public class Exc10test {

	@Test
	public void test() {
		
		Exc10 obj = new Exc10();
		String smStr = obj.func( "Stackroute" , 2);
		assertEquals("Stackroutetete", smStr);
		
	}

}