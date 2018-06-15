package main;
public class Exc3 {
	public static String func(String str){
		String x = "";
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
				case 'u': x= "Vowels";
				break;
				default: x = "Consonants";
				}
			}	
			else
				x= "Invalid";
	}
		return x;
}
}
