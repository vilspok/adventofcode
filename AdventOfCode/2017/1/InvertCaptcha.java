import java.util.Scanner;

/*
 * Usage: Give number in input.txt as parameter when you run the program
 */


public class InvertCaptcha{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String t = args[0];
		
		int sum = 0;
		
		//add first digit to sum, if same as last
		if(t.charAt(0) == t.charAt(t.length()-1)){
			sum += Character.getNumericValue(t.charAt(0));
		}
		//System.out.println("Test: "+ luku);
		
		//add each digit to sum, if its the same as the next one
		for(int x = 0; x < t.length()-1 ; x++)
		{
			if(t.charAt(x) == t.charAt(x+1)){
				sum += Character.getNumericValue(t.charAt(x));
			}
				
		}
		
		System.out.println("Sum is: " + sum);
		
		//****************second part of day 1 *****************
		
		sum = 0;
		//go through first half of numbers
		for(int x = 0; x < t.length()/2; x++){
			if(t.charAt(x) == t.charAt(x + t.length()/2))
				sum += Character.getNumericValue(t.charAt(x));
		}
		//go though second half of numbers
		for(int x = t.length()/2; x < t.length(); x++){
			if(t.charAt(x) == t.charAt(x - t.length()/2)){
				sum += Character.getNumericValue(t.charAt(x));
			}
		}
		System.out.println("Second sum is: " + sum);
	}
}

