package myFirstPackage;

public class Students1 {






    public static void main(String[] args) {


        /* to use the variables of Students Class we need create Students class object = new Students class
        Students. learner3 = new Students();

         */


        System.out.println(Students.year);
        System.out.println(Students.schoolName);
        // set static method to the previous Class for calling the methods to new class by calling className
        Students.study();
        Students.exam();

    }
}
//  complete