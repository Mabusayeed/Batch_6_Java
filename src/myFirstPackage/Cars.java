package myFirstPackage;

public class Cars {


// Data type

    /* primitive data type

    byte	Stores whole numbers from -128 to 127
    short	Stores whole numbers from -32,768 to 32,767
    int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long   	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    Float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	Stores true or false values
    char	Stores a single character/letter or ASCII values

     */

//declaring variables

    byte wheels;
    short mileage;
    int reg_no;
    float height;
    double length;
    boolean carType_Ev;
    char carMake;
    String color;


    public void gear() {
        System.out.println("car can speed up when change the gear");

    }

    public void speed() {
        System.out.println("car can run as fast as we speed up ");

    }

    public static void main(String[] args) {

        //       byte wheels = 4;
        //       short mileage = 31150;
        //       int reg_no = 561000;
        //      float height = 4.567f;
        //        double length = 7.560000;
        //       boolean carType_Ev = false;
        //      char carMake = 'T';
        //        String color = " Red";
        //        System.out.println(wheels);
        //        System.out.println(mileage);
        //        System.out.println(reg_no);
        //        System.out.println(height);
        //        System.out.println(length);
        //        System.out.println(carType_Ev);
        //       System.out.println(carMake);


        Cars myCar = new Cars();

        myCar.wheels = 4;
        myCar.mileage = 31150;
        myCar.reg_no = 561000;
        myCar.height = 4.567f;
        myCar.length = 7.5612345;
        myCar.carType_Ev = false;
        myCar.carMake = 'T';
        myCar.color = "Red";
       // System.out.println(myCar.reg_no);

       // myCar.gear();
      //  myCar.speed ();


        Cars beanCar =  new Cars();

        beanCar.wheels = 4;
        beanCar.mileage = 30150;
        beanCar.reg_no = 551000;
        beanCar.height = 5.567f;
        beanCar.length = 6.5612345;
        beanCar.carType_Ev = true;
        beanCar.carMake = 'H';
        beanCar.color = "Black";
        System.out.println(beanCar);

       // beanCar.speed();
       // beanCar.gear();

    }


}
//complete