import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Convesrion of infix string to postfix string using StackString class and evaluation of postfix string.
 * @author Daniel Duda
 *
 */
public class CalculationScript {
	
	/**
	 * Check which operand char was passed an return integer value.
	 * @param c-char data type passed to method
	 * @return integer which indicates operand precedence
	 */
	static int precedence(char c){
		
		if(c == '+' || c == '-'){
			return 1;
		}
		else if(c == '*' || c =='/'){
			return 2;
		}
		return 0;
	}
	/**
	 * Infix to postfix conversion
	 * @param infix-String data type passed to method
	 * @return  string data type 
	 */
	static String infixToPostfix(String infix){
		
		StackString stack = new StackString(infix.length());
		Scanner scan = new Scanner(infix);
		String postfix = "";
		int i = 0;
		
			while(scan.hasNext()){	
			if (scan.hasNextLong()){
				long tempLong = Long.parseLong(scan.next());
				if(tempLong < 2147483647){
					postfix += " " + tempLong;
				}
				else{
					return "overflow";
				}
		      }
			if (scan.hasNext()){// bez if else
				String next = scan.next();
					
				if(stack.isEmpty()){
					stack.push(next);
				}
				else if(!stack.isEmpty()){
					char operator =  next.charAt(0);
					char stackHead = stack.peek().charAt(0);
					
					if (precedence(operator)  > precedence(stackHead)){
						stack.push(next);
					}
					else if(precedence(operator)  < precedence(stackHead)){
						while(!stack.isEmpty()){
							postfix += " " + stack.pop();
						}
						stack.push(next);	
					}
					else if(precedence(operator)  == precedence(stackHead)){
						postfix += " " + stack.pop();
						stack.push(next);
					}
				}
		      }
		}
		while(!stack.isEmpty()){
			//add space before value because scanner need whitespace between hasnext
			postfix += " " + stack.pop();
		}
		return postfix;
	}
	/**
	 * Evaluation of postfix expression
	 * @param postfix-String data type passed to method
	 * @return String data type
	 */
	 static String evaluatePostfix(String postfix){
		 
		 StackString stack = new StackString(postfix.length());
		 Scanner scanner = new Scanner(postfix);
		 String result = "";
		 int value = 0;
		 int i = 0;
		 while(scanner.hasNext()){
			 
			 if(scanner.hasNextInt()){
				 stack.push(scanner.next());
			 }
			 else if (scanner.hasNext()){
				 
				 String next = scanner.next();
				 char operator =  next.charAt(0);
				
				  int number1 = Integer.parseInt(stack.pop());
				  int number2 = Integer.parseInt(stack.pop());
				 switch(operator) {
				   case '+':
					   value = number2 + number1; 
					   break;
				   case '-' :
					   value = number2 - number1; 
					   break;
				   case '*':
					   value = number2 * number1; 
					   break;	   
				   case '/' :
					   try{
					   value = divide(number2 , number1); 
						 }// end try
						 catch(DivByZeroException e){

					          return "Error: /0";		
				}// end catch
					   break; 
			}//end switch
				 stack.push("" + value);
			 }//end if scanner has next
		 }//end  while
		//add space before value because scanner need whitespace between hasnext
		 result += "" + value;
		return result;	
	}
	 static int divide( int numerator, int denominator)throws DivByZeroException{
	      if ( denominator == 0 )
	         throw new DivByZeroException();

	      return  numerator / denominator;
	   } // End of method divide
 
}
