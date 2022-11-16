package com.email.app;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    private String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};
    
    private char[] incorrect= new char[5];


    public Hangman(){
        // this.gallows = this.gallows.clone();
        
        String[] gallow = this.gallows.clone();
        String[] words = this.words.clone();
        char[] incorrect = this.incorrect.clone();

    }
    public char[] getIncorrect(){
        return this.incorrect;
    }

    public String[] getWords() {
        return this.words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public String getGallows(int index) {
        return this.gallows[index];
    }

    public void setGallows(String[] gallows) {
        this.gallows = gallows;
    }


    public char getUserInput(){

        Scanner scan = new Scanner(System.in);
        String userInput= scan.nextLine();
        // scan.close();
        char finalUserinput = userInput.charAt(0);
        
        return finalUserinput;
    }
    public char[] getRandomWord(){
        int totalWords = words.length;
        Random rand = new Random();
        int random = rand.nextInt(totalWords);
        String randword = words[random];
        char[] arr = randword.toCharArray();
        return arr;
    }

    public char[] getEmptyCorrectArray(char[] correctArray){
        char[] emptyCorrectArray = correctArray.clone();

        for (int i = 0; i < emptyCorrectArray.length; i++) {
            emptyCorrectArray[i]='_';
        }
        return emptyCorrectArray;
        
    }
public void printArray(char[] array){
    for (char x : array) {

        System.out.print(x);
       }
       System.out.println("");
}
public boolean compareArrays(char[] correctArray, char[] emptyArray, char letter){
    int changes =0;
    for (int i = 0; i < correctArray.length; i++) {
        if ( letter == correctArray[i]) {
            emptyArray[i]= letter;
            changes =+ 1;
        }
    }
    if (changes>0) {
        return true;
    } else {
        return false;
    }
}
public boolean checkWinner(char[] correctArray, char[] emptyArray){
for (int i = 0; i < emptyArray.length; i++) {
    if (emptyArray[i]!=correctArray[i]) {
        return false;
    }
}
return true;
}
public void updateIncorrect(char[] incorrect,  char letter, int index) throws IndexOutOfBoundsException{
    incorrect[index]=letter;

}




public static void main(String[] args) {


    
}
}
