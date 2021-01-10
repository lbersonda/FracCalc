
import java.util.*;

public class FracCalc {

	public static final String STOP_CMD = "quit";
	
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);                                                                 //Scanner 'userInput' takes an equation
    	System.out.print("What's your equation? (Type 'quit' to end) ");                                                                    //Print statement to confirm inputed equation
    	String inputEquation = userInput.nextLine();                                                                //'userInput' assigned to String 'inputEquation'
    	
    	while(!(inputEquation.equals(STOP_CMD))) {
    		String outputAnswer = produceAnswer(inputEquation);                                                 //String 'outputAnswer' receives return value from method 'produceAnswer(parameter is 'inputEquation')'
    		System.out.println("The second operand is " + outputAnswer);                                        //Print statement for the outputAnswer
    		System.out.print("\nWhat's the next equation? ");
    		inputEquation = userInput.nextLine();
    	}
    	System.out.println("Scanner Closed");
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input) {                                                              //Method 'produceAnswer' takes in parameter 'inputEquation' as String 'input'
    	int firstSpacePos = input.indexOf(" ");                                                                     //int 'firstSpacePos' assigned to the index of the first space in the equation
    	int secondSpacePos = firstSpacePos + 3;                                                                     //int 'secondSpacePos' assigned to ('firstSpacePos' + 3). Used in substrings as the number following the space after the operator
    	
    	//Separates the equation into sections, operand 1, operator, and operand 2
    	String operand_1 = input.substring(0, firstSpacePos);                                                       //String 'operand_1' is matched with substring of the equation starting at index 0 and ending at the first space
    	String operator = input.substring(firstSpacePos, secondSpacePos);                                           //String 'operator' is matched with substring of the equation at the first space and ends at 'secondSpacePos' which is the first number after the second space
    	String operand_2 = input.substring(secondSpacePos);     
    	
    	int newOperand_2 = Integer.parseInt(operand_2);
    	//String 'operand_2' is matched with substring of the equation starting at 'secondSpacePos' which is the first number after the operator and continues until the end of the equation
      // TODO: Implement this function to produce the solution to the input
        
        return "";                                                                                           //returns operand_2 to main method as String 'outputAnswer' (needed for checkpoint 1)
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}