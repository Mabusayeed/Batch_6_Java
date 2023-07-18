package controlFlowStatementsC5;

public class LoopC6 {
    static int limit = 5;

    /* Types of loop
    1. While loop 2. For loop 3. Do-While loop

    Parts of loop
    1. Initializing 2. Condition 3. Execution 4. Increment or decrement
     */

//    Example 1- while loop
//
//  public static void whileLoop(){// example 1
//
//        int a = 1; // initialization
//        while (a<=100){ //condition
//            System.out.println("The value of a "+a);//statement
//            a++; //increment
//        }
//
//    }
//
    //Example -2
  public static void whileLoop(int inPutValue, int limitValue){ //Parameterized

        int a = inPutValue; // initialization
        while (a<=limitValue){ //condition
            System.out.println("The value of a "+inPutValue);//statement
            inPutValue++; //increment
        }

    }

//    public static void  whileLoop2(){
//      int a = 50;
//        while (a>= 1) {
//            System.out.println("The value of a "+a);
//            a--;// decrement by 1
//        }
//    }

//    public static void  whileLoop2(){
//        int a = 50;
//        while (a>= 1) {
//            System.out.println("The value of a decrement by two "+a);
//            a= a-2;// decrement by 1
//        }
//    }

    public static void  whileLoop2(){
        int a = 50;
        while (a>= 1) {
            System.out.println("The value of a division by two "+a);
            a= a/2;// decrement by 1
        }
    }




    public void forLoop(){
      for (int i =1; i<=limit; i++){
            System.out.println("The value of a "+i);
        }
    }

    public void forLoop2(){
      for (int i = limit; i>=1; i--);

    }
    public void doWhileLoop(){
      int y = 5;
      do {
          System.out.println("This value of Y "+y);
        y++;
      }
      while (y<=10);
    }

    public void fibonacci() {
        //    0 1 1 2 3 5 8 13
        int firstValue = 0;
        int secondValue = 1;

        for (int i = 1; i <= 7; i++) {
            ;
            int thirdValue = firstValue + secondValue;
            firstValue = secondValue; // Q- why?
            secondValue = thirdValue;

            System.out.println(thirdValue);


        }
    }

    public static void shape1() {
        /* shape-1
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         **********
         */

//         for (int i=1; i<= 10; i++){
//
//            for (int j = 1; j <= i; j++) {
//                ;
//                System.out.print("*");
//            }
//             System.out.println();
//        }


//        System.out.println("-------------");

//         int n = 10;
//         for(int i=0;i<n;i++){
//             for(int j =i; j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        for(int i=10; i>=1; i--){

            for(int j=1; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*shape-2
        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *

         */


    }

    public static void main(String[] args) {
        //loopIntro();
     //  whileLoop(50,100); // call the method and arguments-means giving value
        //whileLoop2();
        //Loop obj = new Loop();
        //obj.forLoop();
        //obj.doWhileLoop();
        //obj.fibonacci();
        shape1();

    }


}
//  complete