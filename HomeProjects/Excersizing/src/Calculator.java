// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("I am a calculator, give me an operation ");
            String userinput = scanner.nextLine();
            String[] userinputArray = userinput.split(" ");

            System.out.println(calculate(userinputArray));
        }
    }

    public static int calculate(String[] input) {
        int firstNumber = Integer.parseInt(input[1]);
        int secondNumber = Integer.parseInt(input[2]);

        if (input[0].equals("-")){
            return firstNumber - secondNumber;
        }

        else if (input[0].equals("+")){
            return firstNumber + secondNumber;
        }

        else if (input[0].equals("*")){
            return firstNumber * secondNumber;
        }

        else if (input[0].equals("/")){
            return firstNumber / secondNumber;
        }

        else if (input[0].equals("%")){
            return firstNumber % secondNumber;
        }
        return 404;
    }

}

