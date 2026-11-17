/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fromlooptorecursion;

import java.util.Scanner;

public class FromLoopToRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //to accept an input in a string form so that braces or commas are allowed
        String line = input.nextLine();
        //to remove the braces and extra spaces
        line = line.replace("{", "").replace("}", "").replace(" ", "");
        //To separate the value of the input by the commas
        String[] grade = line.split(",");
        //creates an integer array that will contain all of the converted values
        int[] Grade = new int[grade.length];
        //Using loop to convert string to integer index by index
        for (int i = 0; i < grade.length; i++) {
            Grade[i] = Integer.parseInt(grade[i]);
        }
        String passing = input.nextLine();

        int passingmark = Integer.parseInt(passing);

        System.out.println(countPassingRecursive(Grade, passingmark, 0));

    }

    //METHODS SECTION:
    //FOR LOOP VERSION:
    public static int countPassing(int[] grades, int passingMark) {
        int passed = 0;

        for (int i = 0; grades[i] < grades.length; i++) {
            if (grades[i] >= passingMark) {
                return passed++;
            }
        }

        return passed;

    }

    //FOR RECURSIVE VERSION:
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) {
            return 0;
        }
        //checks if the grades passed or failed
        int currentCount = 0;

        if (grades[index] >= passingMark) {
            currentCount = 1;
        }
        return currentCount + countPassingRecursive(grades, passingMark, index + 1);

    }

//Answer&QUESTIONS:
    //1. In the recursive version it is important for the index to be increased by one or else your code will just repeat the previous
    //code and will not proceed to the other elen=ments in other indeces.
    //2. If you delete the base case it will result to an error called Stackoverflow because the recursion will not stop.   
}
