// Eddie Hart
// Jan 31st, 2024
// CSC 1060

// this imports the scanner!!!!!!!!!!!

import java.util.Scanner;

public class beerbottles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of bottles to start with: ");
        int bottleNumber = input.nextInt();
        // here i hold the beginning input for later when the while loop runs out
        int beginningNumber = bottleNumber;
        // this while loop will run until the bottleNumber variable reaches 0
        while (bottleNumber > 0) {
            // i have a bunch of if and else statements, most notable for when bottleNumber equals 2 and 1
            // this is so that there is correct singular and plural terms according to the number of beer bottles
            if (bottleNumber == 1) {
                System.out.println(bottleNumber + " bottle of beer on the wall, " + bottleNumber + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + (bottleNumber - 1) + " bottles of beer on the wall.\n");
            } else {
                System.out.println(bottleNumber + " bottles of beer on the wall, " + bottleNumber + " bottles of beer.");
                if (bottleNumber == 2) {
                    System.out.println("Take one down and pass it around, " + (bottleNumber - 1) + " bottle of beer on the wall.\n");
                } else {
                    System.out.println("Take one down and pass it around, " + (bottleNumber - 1) + " bottles of beer on the wall.\n");
                }
            }
            bottleNumber--;

        }
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.\nGo to the store and buy some more, " + beginningNumber + " bottles of beer on the wall.");
    }
}