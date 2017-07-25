package userprompt;

import java.util.Scanner;

public class UserPrompt {

	public static void main(String[] args) {
		
		//Declare variables:
		String ourString = "y";
		String response = null;
		
		//Create a scanner:
		Scanner scan = new Scanner (System.in);
		
		do
		{
			System.out.println("Would you like to comtinue?");
			response = scan.nextLine();
			
			if(response.equalsIgnoreCase("Y"))
			{
				System.out.println("okay");
			}
			else if (response.equalsIgnoreCase("N"))
				System.out.println("Quit the program");
			else
			{
				System.out.println("Error. You need to answer y/n.");
				response = "y";
			}
			
		}while(response.equalsIgnoreCase(ourString));
	}

}
