package oopConcept.polymorphismDemoC10;

public class OverRidingSub extends  OverRidingSuper {

    // Create a method about Upright Course and location.
@Override
    public void UprightCourse(){
    super.UprightCourse();

//        String group = "Selinium";
//        System.out.println("This is our group "+group);
//        int duration = 4;
//        int numberOfCourse = 6;
//   " Instead of copying variables from previous class, write name of parent class (super). method(UprightCourse)
//    along with @Override that will copy automatically copy and run the modified method of new class

        String location = "USA";
        System.out.println(location);



    }

    public static void main(String[] args) {
    OverRidingSub obj = new OverRidingSub();
    obj.UprightCourse();


    }





}
