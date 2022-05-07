import java.util.Scanner;

/*
 * Fibonacci number
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34, ... The next number is found by adding up the two numbers
 * before it. Write a program that will output the Fibonacci number up to
 * n, using loop structure.
 */

public class Exam 
{

	public static void main(String[] args) 
	{		
		//variables
		int n, n1, n2, n3;
		n1 = 0;
		n2 = 1;
		n3 = 0;
		
		//scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the maximum positive Fibonacci number: ");
		n = keyboard.nextInt();
		
		System.out.print(n1 + ", ");		
		System.out.print(n2);
		while (n3<n)
		{			
			//stops the program if user enters 1, printing the first 2 numbers
			if (n == 1)
			break;
			
			//calculations
			n3 = n1+n2;
			
			//prints only values for less than or equal to n
			if (n3 <= n)
			{
				System.out.print(", ");
				System.out.print(n3);
			}
			
			//move onto next set of numbers
			n1 = n2;
			n2 = n3;
		}
		//closes scanner object
		keyboard.close();

	}

}
