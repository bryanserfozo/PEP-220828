package W1.D3;

import W1.D2.Calculator;

import java.net.CacheRequest;

public class ControlFlow {

    public static void main(String[] args) {
        // Everything we've done so far has followed the main method line by line, top to bottom

        // We want to change this so we can add in some conditional logic

        // First we'll talk about if statements

        // Let's talk about temperature
        // 70-85 is perfect

        // Greater than 85 it's too hot and less than 70 is too cold

        // GOAL: Given a temperature, print to the console whether it is too cold, too hot, or just right
        int temp = 95;

        // If temp < 70 ---> print "Too Cold"
        if (temp < 70){
            System.out.println("Too Cold!");
        } else if(temp > 85){
            // If temp > 85 ---> print "Too Hot"
            System.out.println("Too Hot!");
        } else {
            // Any other condition ---> just right
            System.out.println("Just Right!");
        }

        System.out.println("End of temperature demo");

        System.out.println("-----------------------------");


        // For loops are useful for when you want to repeat a block code a specific number of times
        // for (counting variable; condition; increment/decrement){}

        // GOAL: Create a loop that prints out 1-10
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        // Simplest way to repeat a block of code a fixed number of times

        System.out.println("-----------------------");
        // GOAL is to print the numbers from 1-30 but if they're divisible by 7 we say "Multiple of 7"

        for (int i = 1; i <= 30; i++){
            // We know we can print every number up to 30, but now how do we check if it is divisble by 7?
            // % is the mod operator, it basically performs division and return the remainder
            if (i % 7 == 0){
                System.out.println("Multiple of 7");
            } else{
                System.out.println(i);
            }

            // Alternatively we could use the ternary operator
//            String result  = (i % 7 == 0) ? "Multiple of 7" : String.valueOf(i);
//            System.out.println(result);
        }


        // We've explored for loops and if else statements now let's look at a while loop

        // While loops are good for looping an uncertain amount of times
        // Secret number game (guess a number 1 - 10)

        int hiddenNumber = 1;
        int guess = 1;

        // We want to loop until the guess is equal to the hidden number
        while (guess != hiddenNumber){
            System.out.println("I'm guessing the number is " + guess + "!");

            // VERY IMPORTANT
            // We need to change the values in the expression we're running so that they eventually become false
            guess++;
        }
        // The guess is now EQUAL TO the hidden number
        System.out.println("I've got it this time! I know the answer is " + guess + "!");

        System.out.println("-------------------------------");


        // Alternative is going to be the do-while loop
        // Similar to the while loop, but we guarantee that it is run at least once
        hiddenNumber = 8;
        guess = 3;

        // We want the user to actually guess before we can tell them if it is right or wrong
        do{
            // Inside here is the statements that we want to loop
            System.out.println("I'm guessing the number is " + guess);
            // VERY IMPORTANT
            // Alter the conditional statment
        } while (guess++ != hiddenNumber);

        System.out.println("Congrats you got the number!");

    }
}
