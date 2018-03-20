public class SpiralMemory{
	
	public static void main(String[] args) {
	
		int number = Integer.parseInt(args[0]);
		int circle = 1;
		
		//find the circle number is on, or rather the length of one side on that circle
		while(number - circle*circle > 0)
		{
			circle = circle + 2;
		}
		
		circle = circle - 2; //go back to previous circle
		number = number - circle*circle; //how many numbers after the last complete circle
		
		/* It doesnt matter on which side the number is on,
		 * what matters is the position on the side.
		 * The path to center is always the same
		 * (look at 10,14,18 and 22 for example).
		 *
		 * So lets reduce the number so we are on the
		 * right hand side, where new circle begins.
		*/
		while(number - (circle + 1) > 0)
		{
			number = number - (circle + 1);
		}
		
		if(number < (circle + 2) / 2) //number "below" the middle of side
		{
			//from middle of side to center + from number to middle of side
			number = ((circle + 2) / 2) + ((circle +2) / 2 - number);
		}
		//the rest, i.e. numbers at middle of side and up, dont need correction
		
		System.out.println("Distance to center: " + number);
		
	}
}

