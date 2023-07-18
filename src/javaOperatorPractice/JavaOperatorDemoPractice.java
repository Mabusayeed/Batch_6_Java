package javaOperatorPractice;

public class JavaOperatorDemoPractice {


    public static void arithmatic(int x, int y){
        int result= x+y;
        System.out.println(result);
        int result1= x-y;
        System.out.println(result1);

    }

    public static void relationalOperators(int a, int b){ // return boolean value ( ><

        boolean result= a>b;

        System.out.println(result);
        result = b>a;
        System.out.println(result);
        result = a>= b;
        System.out.println(result);
    }


    public static void logicalOperators(int a, int b, int c){

                boolean result1 = a>b && b>c;
        System.out.println(result1);

    }


    public static void main(String[] args) {
        arithmatic(10,5);

        System.out.println("-----");

       relationalOperators(5,10);

        System.out.println("----");
        logicalOperators(15,10,5 );


    }

}
