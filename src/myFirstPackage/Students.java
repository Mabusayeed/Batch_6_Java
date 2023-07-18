package myFirstPackage;

import java.nio.ShortBuffer;

public class Students {


    // Declaring the variables or properties

    String firstname;
    String lastname;
    Short studentId;
    int studentBatch;
    char studentGender;
    String group;
    static String year = " Year 2023";
    static String schoolName = "Upright Tech Solution";


    public static void study(){
        String location = "USA";
        System.out.println(location);
        System.out.println("Students must score 80% in the exam to meet passing grade"); // custome method

        }

        public static void exam(){
        int zip = 75240;
            System.out.println(zip);
            System.out.println("Students must study hard to achieve the passing score"); // custom method
        }

    public static void main(String[] args) {

        // create an object

        Students learner1 = new Students();

        // assign the values of the object

        learner1.firstname = "John";
        learner1. lastname = "Smith";
        learner1. studentId = 5100;
        learner1. studentBatch = 6;
        learner1. studentGender = 'M';
        learner1.group = "SQL";

        // print the object value
        System.out.println("The first name of the student is " +   learner1.firstname);
        System.out.println(year);
        System.out.println(schoolName);
        //When me merge strings and variables, we use + sign is called concatenation


        // remove the name of object because of setting to "public static void" exam and study
        study();
        exam();

        System.out.println("----------------------");

        Students learner2 = new Students();

        learner2.firstname = "Jobs";
        learner2. lastname = "Steve";
        learner2. studentId = 5101;
        learner2. studentBatch = 6;
        learner2. studentGender = 'M';
        learner2.group = "Java";

        System.out.println(learner2.firstname + " is the first name of the student " + learner2.lastname+ " "+ learner2.studentId);
        System.out.println(year);
        System.out.println(schoolName);

        // remove the name of object because of setting to "public static void" exam and study
        exam();
        study();

    }

    }
//    complete


