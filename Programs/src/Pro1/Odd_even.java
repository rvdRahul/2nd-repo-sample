package Pro1;

import java.util.Scanner;

public class Odd_even {
	
	
	
	public static void main (String[]args)
	{
		Scanner s =new Scanner(System.in);
		       
	int fno	=s.nextInt();
	
	
 System.out.println("enter 2nd number ");
        
      int  sno=  s.nextInt();
		
		if (fno==sno)
		{
			
			System.out.println("both are equal numbers");
			
		}
		
		else
		{
			
			if (fno>sno)
				
			{
				System.out.println("first number is great");
				
				
			}
			else
			{
				
				System.out.println("second number is greater than first ");
		
			}
		}
		
	}

}
