package decisionStatements;

import java.util.Scanner;

//Nested If else.....
public class LargestThreeNum 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number 1");
	
	int num1 = sc.nextInt();
	
	System.out.println("Enter Number 2");
	int num2 = sc.nextInt();
	
	System.out.println("Enter Number 3");
	int num3 = sc.nextInt();
	
	if (num1>num2) 
	{
		if(num1>num3) 
		{
			System.out.println(" Largest Number  : "+num1);
		}
		else 
		{
			System.out.println(" Largest Number  : "+num3);
		}
			
			
	}
	else
	{
		if(num2>num3)
		{
			System.out.println(" Largest Number  : "+num2);
		}
		
		else 
		{
			System.out.println(" Largest Number  : "+num3);
		}
		
		
	}
	
	
}

}
