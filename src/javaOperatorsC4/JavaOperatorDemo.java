package javaOperatorsC4;

public class JavaOperatorDemo {


    //Arithmetic
    //Relational
    //Logical Operator
    //Assignment Operator


    public static void arithmeticOperators() {
        // Operators +,-,*,/

        int a = 20;
        int b = 9;
        int result = 0;

        result = a + b;
        System.out.println(result);

        result = a - b;
        System.out.println(result);
        result = a * b;
        System.out.println(result);
        float fraction = (float) a/b; //Type casting- not allowed unless needed to do
        System.out.println(fraction);


    }

     static void relationalOperator(){
        // relational operator are >,<, >=,<=, |=  will return boolean value
        int a = 20;
        int b = 9;
        boolean result = false;

        result = a>b;
        System.out.println(result);

        result = a<b;
         System.out.println(result);
         result = a!=b;
         System.out.println(result);

    }

    public static void logicalOperators(){
//        logical operators are &&(and), ||(or),

        int a = 20;
        int b = 9;
        int c = 5;

        boolean result1 = (a>b) && (b<c);
; // When use AND parameter both must true to be result True otherwise False
        System.out.println(result1);

        boolean result2 = (b<a) || (a>c);
        System.out.println(result2);

        boolean result3 = (a>b)|| ( b<a) && (a<c);
        System.out.println(result3);


    }

    public static void main(String[] args) {
        // when call the methods with static Value
//       arithmeticOperators();
//        System.out.println("--------");
      //  relationalOperator();
       logicalOperators();



    }

    //  public void main(String[] args) {
    //  JavaOperatorDemo obj = new JavaOperatorDemo();  when call methods with objects value
    //  obj.arithmeticOperators();
//}


}
//        complete