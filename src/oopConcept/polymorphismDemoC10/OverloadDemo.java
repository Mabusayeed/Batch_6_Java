package oopConcept.polymorphismDemoC10;

public class OverloadDemo {

    /* polymorphism is another OOP Principle. Poly means many
    morphism means form.
    that means we can have many forms of method.
   there are two kinds of polymorphism.
   1. Method overloading-
   2. Method Overriding-

   Examples: when you are working with multiple applications and have
   different URL and different Login information.

   Method overloading - keeping the same method name but changing the
   arguments/parameters within  arguments, order of arguments and data type of arguments
     */

    /**
     * This method is created for macys store login www.macys.com
     * @param username
     * @param password
     */

    public void login(String username, int password){
        System.out.println("Macys Front-end credential");
    }

    /**
     * This method is created for Macy's Credit card login www.macyscard.com
     * @param username
     * @param pin
     * @param password
     */
    public void login( String username,int pin, int password) {
        System.out.println("Macys Card Credential");

    }

    /**
     * This method is created for macys backend www.mysql.com
     * @param number
     * @param hostUserName
     */
    public void login( int number, String hostUserName){
      System.out.println("Macy's back end credential");

    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.login("Mas", 13630);
        obj.login("Sayeed", 1234,4321);
        obj.login(75225, "Dallas");
    }


    }







