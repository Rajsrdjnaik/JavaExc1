package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;

public class Exc4test {

	@Test
	public void test() {
		Exc4 obj = new Exc4();
		int num = obj.numRepeat(3);
		assertEquals(122333,num);
//		num = obj.numRepeat(0);
//		assertEquals(1,num);
	}
	
	@Test
	public void test1() {
		Exc4 obj = new Exc4();
		int num = obj.numRepeat(0);
		assertEquals(0,num);
	}

}
