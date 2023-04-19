package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age) {
        //let folks into the party if they are 21 and up
        //politely tell them they cant enter under age
        if (age >= 21) {
            return "Hello " + name + ", welcome!";
            //this is what happens if the condition is ture
        } else {
            return "Hello " + name + ", I am sorry but we cannot let you into the party";
            //this is what happens if the condition is false
        }

    }

    public String greetingWithUserInput() {
        Scanner theScanner = new Scanner(System.in);

        //We need to ask the user what their name is
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //We need to ask the user what their age is
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        //let folks into the party if they are 21 and up
        //politely tell them they cant enter under age
        if (age >= 21) {
            return "Hello " + name + ", welcome to the 21+ bar!";
        } else {
            return "Hello " + name + ", I am sorry but we cannot let you into the 21+ bar";
        }

    }

    public int addTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter 1st number to add: ");
        int number1 = theScanner.nextInt();

        //ask the user for number2
        System.out.print("Enter 2nd number to add: ");
        int number2 = theScanner.nextInt();

        //return the sum of number1 and number2 together
        return number1 + number2;
    }

    public int subtractTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter 1st number to subtract: ");
        int number1 = theScanner.nextInt();

        System.out.print("Enter 2nd number to subtract: ");
        int number2 = theScanner.nextInt();

        //return the diff of number1 and number 2 together
        return number1 - number2;
    }

    public int multiplyTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter 1st number to multiply: ");
        int number1 = theScanner.nextInt();

        System.out.print("Enter 2nd number to multiply: ");
        int number2 = theScanner.nextInt();

        //return number1 and number 2 multiplied together
        return number1 * number2;
    }

    public int interactiveCalculator() {
        Scanner theScanner = new Scanner(System.in);

        //displays some set of choices to the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER/RETURN: ");

        //waits for user to click 1, 2, or 3 and captures answer here
        int userSelection = theScanner.nextInt();

        int result;

        switch (userSelection) {
            case 1 -> result = this.addTwoNumbers();
            case 2 -> result = this.subtractTwoNumbers();
            case 3 -> result = this.multiplyTwoNumbers();
            default ->
            {
                System.out.println("the user chose nonsense");
                return 0;
            }
        }

        return result;

    }

    public String coinFlip() {

        //attempt to flip a coin
        //return heads or tails

        //this is where we flip the coin using Math.random
        if (Math.random() > .5) {
            //here is where we return heads if the number generated was greater than .5
            return "YOU GOT HEADS";
        } else {
            //here is where we return if the number generated was less than .5
            return "YOU GOT TAILS";
        }
    }

    public String findTheBiggestNumber() {

        //this is the scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for the first input
        System.out.print("give me the first number: ");

        //this is where we capture the input and store
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for the second input
        System.out.print("give me the second number: ");

        //this is where we capture the input and store
        int secondNumber = theScanner.nextInt();

        //this where we run the code Math.max
        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;
    }

    public String findSmallestNumber() {

        //reference the above method to make one that find the smaller of the two numbers
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for the first input
        System.out.print("give me the first number: ");

        //this is where we capture the input and store
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for the second input
        System.out.print("give me the second number: ");

        //this is where we capture the input and store
        int secondNumber = theScanner.nextInt();

        //this where we run the code Math.max
        int theSmallestNumber = Math.min(firstNumber, secondNumber);

        return "The smallest number between " + firstNumber + " and " + secondNumber + " is: " + theSmallestNumber;
    }

    public String findTheDifferenceBetweenTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int number1 = theScanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int number2 = theScanner.nextInt();

        //return the diff of number1 and number 2 together
        int TheDifference = Math.abs(number1 - number2);

        return "The difference between " + number1 + " and " + number2 + " is " + TheDifference;


    }

    public String convertToUppercase(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + "and we converted to: " + theWord.toUpperCase();


    }

    public String convertToLowercase(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all LOWERCASE: ");

        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + "and we converted to: " + theWord.toLowerCase();

    }

    public String lengthOfWord(){

        Scanner theScanner = new Scanner(System.in);

        System.out.println("Enter word to find the length: ");

        String text = theScanner.nextLine();

        return "The length of the word " + text + " is " + text.length();

    }

}


