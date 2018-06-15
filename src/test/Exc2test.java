package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.*;

public class Exc2test {

	@Test
	public void test() {
	Ecx2 obj = new Ecx2();
	String c = obj.func(21);
	assertEquals("Tom",c);
	}
	
	@Test
	public void test1() {
	Ecx2 obj = new Ecx2();
	String c = obj.func(29);
	assertEquals("Tom",c);
	}
	
	@Test
	public void test2() {
	Ecx2 obj = new Ecx2();
	String c = obj.func(28);
	assertEquals("Jerry",c);
	}
	
	@Test
	public void test3() {
	Ecx2 obj = new Ecx2();
	String c = obj.func(31);
	assertEquals("Invalid Entry",c);
	}
}
