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
        System.out.print("Enter number: ");
        int number1 = theScanner.nextInt();

        //ask the user for number2
        System.out.print("Enter number: ");
        int number2 = theScanner.nextInt();

        //return the sum of number1 and number2 together
        return number1 + number2;
    }


    public int subtractTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number1 = theScanner.nextInt();

        System.out.print("Enter number: ");
        int number2 = theScanner.nextInt();

        //return the diff of number1 and number 2 together
        return number1 - number2;
    }

}
