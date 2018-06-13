import java.util.Scanner;

public class Exc6 {
public static void main(String[] args) {
	System.out.println("Input character");
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	if(c>='A'&&c<='Z')
		System.out.println("Capital letters");
	if(c>='a'&& c<='z')
		System.out.println("small letters");
	if(c>='0'&& c<='9')
		System.out.println("Number");
	else 
		System.out.println("Symbol Entered");
	sc.close();
	}

}
