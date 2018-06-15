package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Exc5;

public class Exc5test {

	@Test
	public void test() {
		Exc5 obj = new Exc5();
		int check = obj.func(3, 45, 23, -12);
		assertEquals(56, check);
	}

}