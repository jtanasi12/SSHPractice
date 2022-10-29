import java.util.*;
import java.text.*;

//FIRST
public class average 
{

	public static void main(String[] args)
	{
		int sum = 0, value, count = 0;
		double average; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an integer (0 to quit): ");
		value = scan.nextInt();
		
		while (value != 0)
		{
			count++;
			
			sum += value;
			
			System.out.println("The sum so far is " + sum);
			
			System.out.println("Please enter an integer (0 to quit): ");
			value = scan.nextInt();
			
		}
		
		System.out.println();
		
		if (count == 0)
			System.out.print("No values were entered");
		else
		{
			
			average = (double) sum / count;
			
			
			DecimalFormat fmt = new DecimalFormat("0.###"); // Creates three decimal places
			
			System.out.print("The average is " + fmt.format(average));
			
		}
	}

}
