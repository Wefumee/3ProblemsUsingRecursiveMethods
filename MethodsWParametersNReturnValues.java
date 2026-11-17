/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodswparametersnreturnvalues;

import java.util.Scanner;

public class MethodsWParametersNReturnValues {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this allows the code to recieve one input that contains 
        //two values separated by commas or white spaces.
        input.useDelimiter("[,\\s]+");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(computeAverage(a, b));

    }

    //METHOD FOR PROBLEM1
    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }
        return (double) total / count;
    }

//QUESTIONS AND ANSWERS
    //1.In the computeaverage method we have declared it as static double so that it the
    // answer will be returned in a form of double even though in the parameter of our code we specifically 
    // ask for an int values.
    //2. The if statment inside the method "if(count<=0)" serves as our base case, meaning it is the indicator 
    //when and where our method should stop processing. Without it, our code would have a Stackoverflow error.   
}
