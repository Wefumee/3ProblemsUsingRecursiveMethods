package debugflawedrecursion;

import java.util.Scanner;

public class DebugFlawedRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
         
        //This parameter will prevent the code from resulting to StackOverFlowError.
        if (n < 1 && n != 0) {
            System.out.println("Error. Cannot find factorial of negative integer.");
        //This will prevent the code from returning incorrect values because it exceeded the limit of int in java.
        } else if (n > 12) {
            System.out.println("Error. The int data type limit is only (2,147,483,647).");
        } else {
            System.out.println(factorial(n));
        }

    }

//ANALYZING THE PROBLEM OF THE GIVEN CODE
    /*
    public static int factorial(int n) {
if (n == 0) { return 0; } // <-- look closely at this line
return n * factorial(n - 1);
} 
    My own analysis based on observation and inspection:
        The declaration of the base case was logically lacking for this kind of problem which would result in
        an innacurate answer or values that may be returned. As demonstrated in the given code, 
        the method returns 0 if n==0 which is wrong because factorial of zero is 1.
        The given base case lacks a more wider scope that may be used in the parameter inside the base case.
    
    The correct version should be
        public static int factorial(int n) {
            if (n < 1 ) { 
            return 1;}    
            return n * factorial(n - 1); 
    
     */
//THUS,
    //CORRECTED VERSION OF THE METHOD:
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

//ANSWER & QUESTION:
    /*1.Even if only one return is wrong, it can affect the accuracy of your code as a whole.
    just like in the given, it is mathematically incorrect to return 0 if you are solving 
    for the factorial of n==0, because the factorial of 0 is 1. Additionally, it would eventually
    collapse into 0 because it would multiply the recursive process into 0.*/
    /*2.In the given code, it did not include handling edge cases such as inputs that is
    negative integer or an integer that is greater than 12, which would give or results to StackOverFlow
    or incorrect values or answer.
    */
}
