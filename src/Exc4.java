import java.util.Scanner;
public class Exc4 {

	public static void main(String[] args) {
		
		int a; 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter an integer");
	      a = in.nextInt();
	      
	      for (int i= 1; i<=a; i++)
	      {
	    	  for(int j=1; j<=i; j++)
	    		  System.out.print(i);
	      }
	}

}
