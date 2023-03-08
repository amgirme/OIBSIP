package task2;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game2 {

	public static void main(String[] args) {

		int ans, guess, guessNum =0;
		int noOfGuesses=1;
        final int maxGuesses = 8;
        String str, playAgain = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        ans = generator.nextInt(100) + 1;

        while 
        
        
           (playAgain.equals("y") || playAgain.equals("Y"))
        {
        	System.out.println("Hey!! WELCOME TO THE NUMBER GUESSING GAME");
        	System.out.println("\nHere are some rules to follow while playing a game...");
        	System.out.println("\n1. Yow will get total 8 attempts to guess the number");
        	System.out.println("\n2. You will score 2 points on  correct guessing");
        	System.out.println("\n3. You will get a chance to re-attempt a game");
        	System.out.println("\nLet's Start a Game");
            System.out.println("\nGuess a number from 0 to 100");
            System.out.println("Enter your guess (0 to quit):");

            guess = scan.nextInt();
            guessNum = 0;
            while (guess != 0)
            
            {
                guessNum++;
                if (guess == ans) 
                {
                    System.out.println("CONGRATS! You got it Right!");
                    /*if(guess ==ans)
                    {
                    	System.out.println("You have scored 2 points...");
                    }*/
                    switch(noOfGuesses) {
                    case 1:
                        System.out.println("your score = 100 out of 100 ");
                        System.out.println("your points= 10 points out of 10 ");
                        break;
                    case 2:
                        System.out.println("your score = 90 out of 100 ");
                        System.out.println("your points= 9 points out of 10 ");
                        break;
                    case 3:
                        System.out.println("your score = 80 out of 100 ");

                        System.out.println("your points= 8 points out of 10 ");
                        break;
                    case 4:
                        System.out.println("your score = 70 out of 100 ");
                        System.out.println("your points= 7 points out of 10 ");
                        break;
                    case 5:
                        System.out.println("your score = 60 out of 100 ");
                        System.out.println("your points= 6 points out of 10 ");
                        break;
                    case 6:
                        System.out.println("your score = 50 out of 100 ");
                        System.out.println("your points= 5 points out of 10 ");
                        break;
                    case 7:
                    System.out.println("your score = 40 out of 100 ");
                        System.out.println("your points= 4 points out of 10 ");
                        break;
                    case 8:
                    System.out.println("your score = 30 out of 100 ");
                        System.out.println("your points= 3 points out of 10 ");
                        break;
                    case 9:
                    System.out.println("your score = 20 out of 100 ");
                        System.out.println("your points= 2 points out of 10 ");
                        break;
                    case 10:
                    System.out.println("your score = 10 out of 100 ");
                        System.out.println("your points= 1 point out of 10 ");
                        break;

                    }
                    
                    break;
                } 
                else if (guess < ans) {
                    System.out.println("Opss! Your guess was too LOW, Don't loose Hope!! Please try some higher numbers.");
                	noOfGuesses++;}
                
               else if (guess > ans) {
                    System.out.println("Opss! Your guess was too HIGH, Don't loose Hope!! Please try some lower numbers");
                    noOfGuesses++;
               }
                if (guessNum == maxGuesses)
                {
                    System.out.println("The number was " + ans +""
                            + "\n Thank you!! Better luck next time"+"\nMay you enjoy a game");
                    break;
                }
                
                
                System.out.println("Enter your guess (0 to quit):");
                guess = scan.nextInt();
            }
           
           
           System.out.println(" Thank you!!"+"\nMay you enjoy a game"+" \nHey!! do you Want to Play again?(y/n)");
            playAgain = scan.next();
        }
        System.out.println("Thanks for playing!");

	}

}
