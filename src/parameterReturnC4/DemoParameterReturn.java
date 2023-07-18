package parameterReturnC4;


// /why do we parameterized?- We can call the  method several times with different value.
public class DemoParameterReturn {

 //   public void add(int x, int y){//Declare parameter variables in method signature or parameterized
       // local variables
       // int x = 1; // not common business practice to chang value or script inside the method
       // int y = 2;// instead crate parameter or method signature
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
//    }

 //   public void add(int x, int y){  // create parameter/method signature
    //int z = x+y;
    //int a = z;
       // System.out.println(z);
       // System.out.println(a);


//    }

    public int substract(int x, int y) { // public int must return as integer
        int z = x - y;
        int a = z;
      //  System.out.println("Hello");
        return a;// will return without println

    }


    public String studentName(String name ){

        return name;

    }

    public boolean gender(){

        boolean isMale = true;

        return isMale;

    }



    public static void main(String[] args) {
        DemoParameterReturn obj = new DemoParameterReturn();
     //  obj.add(5, 4);
      //  System.out.println("----------------");
       // obj.add(9,10);

       int newValue =  obj.substract(20, 5); // check lesson again to return value
        System.out.println(newValue);

        String newName = obj.studentName("Sayeed");
        System.out.println(newName);

        boolean studentGender = obj.gender();
        System.out.println(studentGender);


    }




}

// complete