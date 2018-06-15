package test;

import static org.junit.jupiter.api.Assertions.*;
import main.*;

import org.junit.jupiter.api.Test;

public class Exc3test{

	@Test
	public void test() {
		Exc3 obj = new Exc3();
		String str = obj.func("rajat");
		for (int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
			{	switch(c)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': assertEquals("Vowels",str);
				break;
				default: assertEquals("Consonants",str);
				}
			}	
			else
				assertEquals("Invalid",str);
	}

}
}