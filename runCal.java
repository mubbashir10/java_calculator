//importing libraries
import java.util.*;
import java.util.Scanner;


public class runCal{

    public static void main(String[] args){

        //declaring variables
        int count;
        int operation;
        String numSet;

        //making objects
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        tinyCal tObj = new tinyCal();


        //asking for input
        System.out.print("Enter number count: ");
        count = input.nextInt();


        //generating number set
        int[] set = new int[count];
        for (int i=0; i<count; i++)
            set[i] = ran.nextInt(10) + 1;

        //printing set of number
        System.out.println("\nThe generated set of numbers is:");
        numSet = java.util.Arrays.toString(set);
        System.out.println(numSet);

        //select operation
        System.out.println("\nSelect your operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        operation = input.nextInt();

        //calling operations
        switch (operation){
        case 1:
            tObj.add(set);
            break;
        case 2:
            tObj.add(set);
            break;      
        case 3:
            tObj.add(set);
            break;
        case 4:
            tObj.add(set);
            break;
        default:
            System.out.println("Invalid Operation (select 1-4)");

        }

    }
}    