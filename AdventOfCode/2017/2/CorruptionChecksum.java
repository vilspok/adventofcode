import java.io.*;
import java.util.*;

public class CorruptionChecksum{
	
	public static void main(String[] args) {
	
		int sum = 0;
		int smallest;
		int biggest;
	
		try{
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			String line = in.readLine();
			
			//go through each line
			while(line != null)
			{
				StringTokenizer st =  new StringTokenizer(line); 
				
				//first number
				String number = st.nextToken();
				int currentNum = Integer.parseInt(number);
				smallest = currentNum;
				biggest = currentNum;
				
				//..and rest of numbers
				while(st.hasMoreTokens())
				{
					number = st.nextToken();
					currentNum = Integer.parseInt(number);
					//System.out.println("Current number: " + currentNum);
					if(currentNum < smallest)
					{
						smallest = currentNum;
					}
					if(currentNum > biggest)
					{
						biggest = currentNum;
					}
				}
				
				//add to sum
				sum += (biggest - smallest);
				//System.out.println("After number sum is: " + sum);	
				
				//next line
				line = in.readLine();
				
			}
			System.out.println("Sum is " + sum);
			
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
			
				
		
		
	}
}

