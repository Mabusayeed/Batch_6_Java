package controlFlowStatementsC5;


import java.util.Scanner;

public class IfElseStatement {

    // Conditional Statement- 1. condition 2. block
    // Global or instance variables

    int a = 2;
    int b = 4;
    int c = 7;

    /* There are few types of conditional statements
    1. If statement
    2. If else statement
    3. If else ladder
    4. Nested if else
     */

    public void ifStatement(){ // condition is true to the variable then block will execute

        if ( a==2){
            System.out.println("a is equal to 2");
            String hi = "Hello";
            System.out.println(hi);
        }
    }

    public void ifElseStatement(){

//        if(a==1){
//            System.out.println("A is equal to 1");
//        }
//        else {
//            System.out.println("The value of A is something else");
//        }

        if (b%3==0)
            System.out.println("This is an even number");

        else {
            System.out.println("This is an odd number");
        }

    }

    public void ifElseLadder(){
//        int a = 2;
//        int b = 5;
//        int c = 7;



        if((a>b) && (b<c)){
            System.out.println("a>b and b<c");
        }

        else if ((a>c)||(c<b)){
            System.out.println("a>c or c<a");
        }

        else if ((a+b<c)&&(a>b)){
            System.out.println("a+b<c and a>b");

        }
        else {
            System.out.println("nothing matches");
        }

    }

    public void nestedIfElseStatement(){

        if((a>b) && (b<c)){
            System.out.println("a<b and b<c");
        }

        else if ((a>c)||(c<b)){
            System.out.println("a<c or c<a");
        }

        else if ((a+b<c)&&(a>b)){
            System.out.println("a+b<c and a>b");

        }
        else {


            if((a*b<c)&&(a<c)){
                System.out.println("a*b<c and a<c" );
            }
            else if((a+b<c)&& (a>b)){
                System.out.println("a+b<c and a>b");
            }
            else {
                System.out.println("None matches");
            }
        }
    }


    public static void main(String[] args) {
        IfElseStatement obj= new IfElseStatement();
//       obj.ifStatement();
//       obj.ifElseStatement();
 //       obj.ifElseLadder();
        obj.nestedIfElseStatement();


    }


}
// complete