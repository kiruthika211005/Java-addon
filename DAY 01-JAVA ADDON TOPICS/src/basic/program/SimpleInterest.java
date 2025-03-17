package basic.program;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
		//getting input from the user
		Scanner in = new Scanner(System.in);
		
		
		//variable declaration as well as intialization
		System.out.println("Enter the principle amount");
		int p = in.nextInt();
		System.out.println("No of months:");
		int n = in.nextInt();
		System.out.println("Rate of Interest:");
		int r = in.nextInt();
		
		//process the result
	    float res  = p * n * r / 100;
	    
	    //display the result
	    System.out.println("Interest Amount:"+res);

	}

}
