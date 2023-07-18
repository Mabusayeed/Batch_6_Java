package constructorLessonC8;

public class ConstructorDemo {

    /* Constructor is a special method that hold the same name as class. we can parameterize the constructor
    and give arguments while creating an object.

    Types of constructor
    1. Parameterized constructor
    2. Default constructor
     */

    String name;
    int id;
    String location;
    boolean isMale;

    public ConstructorDemo(String name, int id, String location, boolean isMale){
       this.name= name;
       this.id=id;
       this.location=location;
       this.isMale=isMale;

    }

    public ConstructorDemo(){
        System.out.println("Hello");

    }



    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo("Arafat", 101 , "New York",true);

        System.out.println(obj.name+ " "+ obj.id+ " "+obj.location+ " "+ obj.isMale);
        System.out.println("----------------------------------");

        ConstructorDemo obj1= new ConstructorDemo("Sayeed", 102 , "Texas",true);

        System.out.println(obj1.name+ " "+ obj1.id+ " "+obj1.location+ " "+ obj1.isMale);
        System.out.println("----------------------------------");

        ConstructorDemo obj2= new ConstructorDemo("Lisa", 103 , "New York",false);

        System.out.println(obj2.name+ " "+ obj2.id+ " "+obj2.location+ " "+ obj2.isMale);
        System.out.println("----------------------------------");

        ConstructorDemo obj3 = new ConstructorDemo();




    }







}
