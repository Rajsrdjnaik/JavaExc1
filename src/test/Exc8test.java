package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.*;

public class Exc8test {

	@Test
	public void test() {
		Exc8 obj = new Exc8();
		boolean check = obj.func(34, Math.random()*100);
		assertEquals(false ,check);
	}

}