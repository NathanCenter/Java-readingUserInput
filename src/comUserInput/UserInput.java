package comUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Your task will be to write the code to collect numeric input from console.

In order to get numeric input, you'll need to know how to "parse" a String and convert it to a number.

Given the example from the previous lesson, you know how to read a String as input from the console.

To convert this input to a number, simply use Integer.parseInt(theStringInputVariableHere)

The Integer.parseInt() method will return the Integer value of your String input.

Here's an example of how to do it:

String input = scanner.nextLine();

Integer convertedInput = Integer.parseInt(input);*/
		
		/* 
		 * 
Once you have the code to collect numeric input, your next task will be to validate that this numeric input is within a range of 50 to 300.

If the numeric input is below 50 or above 300, your program should output "No!", otherwise it should output "Yes!"*/
		System.out.println("Type a number between 50 and 300");
		Scanner scan= new Scanner(System.in);
		String UserInput=scan.nextLine();
		int convert=Integer.parseInt(UserInput);
		
		System.out.println(convert);
		if(convert<50 && convert>300 ) {
			System.out.println("No!");
		}
		else {
			System.out.println("Yes!");
		}
		
	}

}
