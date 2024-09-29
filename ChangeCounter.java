/* 
 * Filename: ChangeCounter.java 
 * Written by: Jessica Soler
 * Written on:  9/28/2024
 * Convert dollars into change 
 */ 


import java.util.Scanner; 
class ChangeCounter { 
    public static void main(String[] args) { 
        // Declare scanner input object
        Scanner input = new Scanner(System.in);

        // TODO: Declare currency value constants needed for counting change
        final int TWENTY = 20;
        final int TEN = 10;
        final int FIVE = 5;
        final int ONE = 1;         

        // TODO: Declare variables needed for conversion
        int dollars = 0;
        int twenties = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;
 

        // TODO: Print creative title
        System.out.println("*------------------*");
        System.out.println("|  Change Counter  |");
        System.out.println("*------------------*");
 

        // TODO: Get dollars input from user
        System.out.print("Enter dollars: ");
        dollars = input.nextInt();
 

        // TODO: Calculate change in 20's, 10's, 5's, and 1's
        if (dollars < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        } else if (dollars == 0) {
            System.out.println("No change.");
            System.exit(0);
        } else if (dollars < 5) {
            System.out.println("Not enough money to make change.");
            System.exit(0);
        } else if (dollars > 5 && dollars <= 10) {
            fives = dollars / FIVE;
            dollars = dollars % FIVE;
            ones = dollars / ONE;
            dollars = dollars % ONE;
        } else if (dollars > 10 && dollars <= 20) {
            tens = dollars / TEN;
            dollars = dollars % TEN;
            fives = dollars / FIVE;
            dollars = dollars % FIVE;
            ones = dollars / ONE;
            dollars = dollars % ONE;
        } else if (dollars > 20) {
            twenties = dollars / TWENTY;
            dollars = dollars % TWENTY;
            tens = dollars / TEN;
            dollars = dollars % TEN;
            fives = dollars / FIVE;
            dollars = dollars % FIVE;
            ones = dollars / ONE;
            dollars = dollars % ONE;
        }
            
        // TODO: Display result 
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);

        // Close scanner input object 
        input.close(); 
   } 
} 