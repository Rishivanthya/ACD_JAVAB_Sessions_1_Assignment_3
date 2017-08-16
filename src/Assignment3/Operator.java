package Assignment3;  //Package declaration

import java.util.Scanner;

/*
 * This class will show comparison of Bitwise and Logical AND 
 * Bitwise AND is used to check bits
 * Logical AND is also called as Short- circuit operator .
 */
public class Operator {       //Operator is declared as  class name 

	public static void main(String args[])     //Main method contain if else loop to show comparison of Bitwise and Logical AND
	{
		// TODO Auto-generated method stub
		               
		int num1;
		int num2;
	
		Scanner input = new Scanner(System.in); //Scanner class invoke constructor with argument System.in
		System.out.println("Enter the values of a and b"); // printing 
		num1 = input.nextInt(); // user input will get stored in value n ,nextInt --for getting input as integer.
		num2 = input.nextInt();
		
		 
		input.close(); 	// invoking close method to avoid resource leak
		if (num1==1 && num2==0)             //it will returns true if both conditions are true. If either conditions is false, it returns false value.
		{	System.out.println("Logical AND operators returns the value only when the both conditions value is true ");    //printing the statement if  two values returns true
		}
		else if(num1==0 & num2==1)                                                                                            //it will returns true if both the conditions  are true. If either conditions is false, it returns false value.

		{
			System.out.println("The Bitwise AND operators returns the value when both  of the condition is true :");  //Prinitng the statement if any values returns true 
		}
		else
		{
			System.out.println("Both are not true ");  // Printing the value if nothing is true.
		}
	}
} //close the loop
