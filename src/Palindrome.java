import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int reversedInteger = 0, remainder, originalInteger, x = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter number");
		int num = sc.nextInt();
        originalInteger = num;
        x = originalInteger;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
//            System.out.println(reversedInteger);
        }

        if (originalInteger == reversedInteger)
        { System.out.println(originalInteger + " is a palindrome.");
	        while( x != 0 )
	        {
	            remainder = x % 10;
	            if(remainder%2 == 0)
	            {	
	            	sum = sum + remainder;
	            }
	            x  /= 10;
	        }
	            System.out.println("sum is "+ sum);   
	     }
        else
            System.out.println(originalInteger + " is not a palindrome.");
        if (sum<25)
    	{
    		System.out.println("Sum is less than 25");
    	}
    	else
    	{
    		System.out.println("Sum is more than 25");
    	}
	}
	
}
