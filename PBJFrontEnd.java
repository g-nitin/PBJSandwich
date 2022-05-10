/*
Nitin Gupta

Homework 05
Peanut Butter and Jelly Sandwich
 */

import java.util.Scanner;

public class PBJFrontEnd {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true; // flag for whether the program continues at the end
        while (flag)
        {
            System.out.println("\n\nIn the first sandwich...");
            PBJSandwich sandwich1 = sandwichMaker();
            System.out.println("\n\nIn the second sandwich...");
            PBJSandwich sandwich2 = sandwichMaker();

            System.out.println("\n\nSandwich 1:");
            System.out.println(sandwich1);
            System.out.println("\nSandwich 2:");
            System.out.println(sandwich2);

            System.out.println("\nAre they the same sandwich?");
            System.out.println( sandwich1.equals(sandwich2) );

            boolean correctInput = false; // flag for whether to user input correctly
            while (!correctInput)
            {
                System.out.println("Would you like to exit? Type \"quit\" to exit or" +
                        " type \"new\" to restart");
                String wantExit = keyboard.nextLine();

                if (wantExit.equalsIgnoreCase("quit"))
                {
                    flag = false;
                    correctInput = true;
                    System.out.println("\nGood bye");
                }
                else if (wantExit.equalsIgnoreCase("new"))
                {
                    correctInput = true;
                }
                else // invalid input
                {
                    System.out.println("Invalid input." +
                            "\nPlease try again!");
                }
            }

        }

    }

    public static PBJSandwich sandwichMaker() // helps make the sandwich with the user
    {
        System.out.println("\nFor the top slice of the bread... \nEnter the name of the bread: ");
        String topSliceName = keyboard.nextLine();
        System.out.println("Enter the number of calories in the bread: ");
        int topSliceCalories = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the type of bread: ");
        String topSliceType = keyboard.nextLine();
        Bread topSlice = new Bread(topSliceName, topSliceCalories, topSliceType);

        System.out.println("\nFor the peanut butter... \nEnter the name of the brand: ");
        String pBName = keyboard.nextLine();
        System.out.println("Enter the number of calories: ");
        int pBCalories = keyboard.nextInt();
        keyboard.nextLine();

        boolean checkBoolean = false; // flag to check whether the user enter a boolean
        String pBIsCrunchyString = ""; // initializing a String to parse into boolean later
        boolean pBIsCrunchy = false; // initializing a default value
        while (!checkBoolean)
        {
            System.out.println("Enter \"true\" or \"false\" if it is crunchy: ");
            pBIsCrunchyString = keyboard.nextLine();

            if (pBIsCrunchyString.equals("true") || pBIsCrunchyString.equals("false") )// checks
            {
                pBIsCrunchy = Boolean.parseBoolean(pBIsCrunchyString);
                checkBoolean = true;
            }
            else // invalid input
            {
                System.out.println("Invalid input. \nPlease try again!");
            }
        }
        PeanutButter pB = new PeanutButter(pBName, pBCalories, pBIsCrunchy);

        System.out.println("\nFor the jelly... \nEnter the name of the brand: ");
        String jellyName = keyboard.nextLine();
        System.out.println("Enter the number of calories: ");
        int jellyCalories = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the type of fruit the jelly is made from: ");
        String jellyFruitType = keyboard.nextLine();
        Jelly jelly = new Jelly(jellyName, jellyCalories, jellyFruitType);

        System.out.println("\nFor the bottom slice of the bread... \nEnter the name of the " +
                "bread: ");
        String bottomSliceName = keyboard.nextLine();
        System.out.println("Enter the number of calories in the bread: ");
        int bottomSliceCalories = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the type of bread: ");
        String bottomSliceType = keyboard.nextLine();
        Bread bottomSlice = new Bread(bottomSliceName, bottomSliceCalories, bottomSliceType);

        return new PBJSandwich(topSlice, pB, jelly, bottomSlice);

    }

}
