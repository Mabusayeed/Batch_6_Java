package controlFlowStatementPractice;

public class LoopP {

    public static void whileLoop1(){
        int a= 1;
        while (a<=10){
            System.out.println(a);
            a++;
        }

    }
    public static void whileLoop0(){
        int a= 1;
        while (a<=10){
            System.out.println(a);
            a++;
        }

    }


    public static void whileLoop(int initialize, int limit){
        int a=initialize;
        while (initialize<=limit){

            System.out.println(initialize);
            initialize++;
        };

    }

        public static void whileLoop2(int initialize, int limit){
            int a = initialize;
            while( initialize>=limit){
                System.out.println(initialize);
                initialize--;
            }
    }

    public static void whileLoop3(){
        int a = 10;
        while( a>=1){
            System.out.println(a);
           a=(a-3);
        }
    }

    public static void forLoop1(){
        for (int i=1; i<=5;i++){
            System.out.println("Value of a " +i);

        }

    }

    public static void forLoop2(){
        for (int i=5; i>=1;i--){
            System.out.println("Value of a " +i);

        }

    }

    public static void doWhileLoop(){
        int y=5;
        do{
            System.out.println("This is value of y "+ y);
            y++;
        }
        while (y<=10);

    }

    public static void fibonacci(){
        int firstN=0;
        int secondN=1;


        for(int i=1; i<=7; i++){
           int thirdN=firstN+secondN;
           firstN =secondN;
           secondN=thirdN;
            System.out.println(thirdN);
        }

    }

    public static void shapeOne(){
        for (int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void shapeTwo(){
        for (int i=5; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fibonacciTest(){
        int firstN=0;
        int secondN=1;

        for(int i=1;i<=7; i++){
            int thirdN=firstN+secondN;
            firstN=secondN;
            secondN=thirdN;
            System.out.println(thirdN);

        }

    }

    public static void shapeTest(){
        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//        LoopP obj= new LoopP();
//        obj.whileLoop0();

  //      whileLoop(1,5);
//        whileLoop1();

//        whileLoop2(10,1);
//        whileLoop3();
//        forLoop1();
//        System.out.println("------");
//        forLoop2();
//        System.out.println("------");
//        doWhileLoop();
//        fibonacci();
//        shapeOne();
//        shapeTwo();
 //       fibonacciTest();
        shapeTest();

    }

}
