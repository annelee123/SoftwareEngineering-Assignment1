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

public class CalculatorApp {

	boolean validResult = true;
		public int calculator(String exp){
			int n = exp.length();
			int num1 = 0;
			int num2 = 0;
			int f1 = 0;
			int f2 = 0;
			char op1 =' ';
			char op2 =' ';
			int result = 0;

			for(int i = 0; i<n; i++){
				char ch = exp.charAt(i);

				//build number 1
				if(ch >='0' && ch <='9' && f1 == 0){
					num1 = num1*10+Character.getNumericValue(ch);

					if(i == n-1){
						result=num1;
					}
				}

				//build number2
				else if(ch >= '0' && ch <= '9' && f1 == 1){
					num2 = num2*10+Character.getNumericValue(ch);
				}

				//build operator
				else if(ch == '+'|| ch == '-'|| ch == '*'){
					if(f1==0){
						f1=1;   //number 1 is found
						op1=ch; //whatever is the character is the operator
					}
					else if(f1==1 && f2==0){
						f2=1;
						op2=ch;
					}
				}
				else if(ch == ' '){

				}

				//error message
				else{
					validResult = false;
					return 0;
				}
				
				//performing the operation
				if((f1 == 1 && f2 == 1)|| i == (n-1)){

					if(op1 == '*'){
						result = num1*num2;
					}
					else if(op1 == '-'){
						result = num1-num2;
					}
					else {
						result = num1+num2;
					}

					num1 = result;
					f2 = 0;
					num2 = 0;
					op1 = op2; 
				}
			

			}
			
		return result;
		}

	}