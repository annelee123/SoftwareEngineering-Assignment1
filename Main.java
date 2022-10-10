package calculatorApp;

import java.util.Scanner;


/*The app will interactively take a string representing a simple mathematical expression from the user (e.g. “12435+34569-12345*10+50”). 
After the user inputs the string, the app will check if the string represents a valid expression (no unexpected string characters, no duplicate 
operation characters, etc.). After validating the expression, the app will output a string containing the result. In case of invalid expression, 
it should output an appropriate error message.  For simplicity, we will consider only addition, subtraction, and multiplication operations. 
Also, we will only consider integers. 
You should apply the branching concept in your repo for developing the program. 
Also, you should write suitable unit tests to be run in the CI workflow that will be triggered when pushing or merging into the main branch.  
*/

public class Main {

	public static void main (String args[]) {
		boolean exit = false;
		while (!exit) {
			System.out.print("Please enter a mathematical expression or enter 'exit': ");
			Scanner sc = new Scanner(System.in);
			String mathExp = sc.nextLine();
			int strLen = mathExp.length();
			CalculatorApp app = new CalculatorApp();
			if(mathExp.equals("exit")) {
				exit = true;
			}
			else if(mathExp.charAt(0) == '+' || mathExp.charAt(0) == '-' || mathExp.charAt(0) == '*') {
				System.out.println("Please enter valid input");
			}
			else if(mathExp.charAt(strLen-1) == '+' || mathExp.charAt(strLen-1) == '-' || mathExp.charAt(strLen-1) == '*') {
				System.out.println("Please enter valid input");
			}
			else {
				int result = app.calculator(mathExp);
				if(app.validResult == false) {
					System.out.println("Please enter valid input");
				}
				else {
					System.out.println("Result= " + result);
				}
			}
		}
		System.out.println("Program has exited");
	}

	}