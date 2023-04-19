package org.yup;

//Doing to show you an import but this is not required since both are in the same package
//import org.yup.Challenges;
public class JavaChallengesApp {
    public static void main(String[] args) {


        //creates a new instance of the challenges class so we can use the challenges in our application
        Challenges challenges = new Challenges();

/*
        //this runs the greeting methods from our challenges and returns a string greeting and
        //stores it in the greeting variable we created
        String greeting = challenges.greeting("Guest",21);


        //this prints the greeting in the console
        System.out.println(greeting);


        //code below is running greeting WithUserInput()
        String greetingWithUserInput = challenges.greetingWithUserInput();
        System.out.println(greetingWithUserInput);


        //code below is running addTwoNumbers
        int Add = challenges.addTwoNumbers();
        System.out.println(Add);


        //code below is running subtractTwoNumbers
        int Subtract = challenges.subtractTwoNumbers();
        System.out.println(Subtract);


        //code below is running multiplyTwoNumbers
        int Multiply = challenges.multiplyTwoNumbers();
        System.out.println(Multiply);


        code below is running interactiveCalculator
        int interactiveCalculator =challenges.interactiveCalculator();
            System.out.println(interactiveCalculator);

        System.out.println(challenges.coinFlip());

            System.out.println(challenges.findTheBiggestNumber());

      System.out.println(challenges.findSmallestNumber());

      System.out.println(challenges.findTheDifferenceBetweenTwoNumbers());


      System.out.println(challenges.convertToUppercase());

        System.out.println(challenges.convertToLowercase());
 */

        System.out.println(challenges.lengthOfWord());

    }

}
