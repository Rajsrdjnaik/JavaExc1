import java.util.Scanner;

public class Ecx2 {

	public static void main(String[] args) {
		int a;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter an integer");
	      a = in.nextInt();
	      
	      if(a>20 && a<30)
	      {		
	    	  System.out.println("Number lies between 20 and 30");
	    	  if(a%2 == 0)
	    	  		System.out.println("Tom");
	    	  else
	    		  	System.out.println("Jerry");
	      }
	      else
	    	  System.out.println("Number doesn't lie between 20 and 30");
	}

}
