import java.util.Scanner;

public class Hundreds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //User inputs for first number
        System.out.println("Enter a number with at least three digits: ");            
        int num1 = scan.nextInt();

        //User inputs for second number
        System.out.println("Enter a second number with at least three digits: ");
        int num2 = scan.nextInt();
        
        //Finding hundreds place digit for first number
        int num1Hundreds = (num1/100);
        num1Hundreds = num1Hundreds % 10;
        
        //Finding hundreds place digit for second number
        int num2Hundreds = (num2/100);
        num2Hundreds = num2Hundreds % 10;
        
        //Labeling for first and second number
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        //Labeling for hundreds place digit
        System.out.println("Hundreds place digit for first number: " 
                + num1Hundreds);
        System.out.println("Hundreds place digit for second number: " 
                + num2Hundreds);
        
        //Sum of hundreds place digits
        System.out.println("Sum of hundreds place values: " 
                + (num1Hundreds + num2Hundreds));
    }
}
