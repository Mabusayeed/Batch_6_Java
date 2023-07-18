package scannerDemoC5;
//Why are we use scanner? - we use scanner to read user input from the console

import java.util.Scanner;

public class ScannerPractice {

    public void myscanner(){
        System.out.println("Hello");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your first name");
       String myName =  scan.nextLine();// allow to  write something
       // System.out.println(myName);
        System.out.println(" I am reading my name from console "+myName);

        System.out.println("Enter your street address");
        int myStreetAddress = scan.nextInt();
        System.out.println("My Street address is "+myStreetAddress);

        System.out.println("How far New York from Texas?");
        short myDistance = scan.nextShort();
        System.out.println("My distance about in miles "+myDistance);

        System.out.println("Do you live in Dallas?");
        boolean myAnswer = scan.nextBoolean();
        System.out.println("My answer is yes "+myAnswer);
    }


    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice(); // initiated class
        obj.myscanner();

    }

     /*System.out.println("Hello");

     We can write and use the user input with help of scanner class from Java
     using different method ( Data )

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
    // scan.nextLine(); create method variable to allow write in console
    String myName = scan.nextLine(); // Read from console
        System.out.println(myName)*/

}
//  complete