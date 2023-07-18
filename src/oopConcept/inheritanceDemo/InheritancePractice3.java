package oopConcept.inheritanceDemo;

public class InheritancePractice3 extends InheritancePractice2 {
    String timeZone;
    String state;


    public static void main(String[] args) {

        InheritancePractice3 obj = new InheritancePractice3();
        obj.hello();
        obj.name = "MAS";
        obj.location = "Texas";
        obj.group= "Java";
        obj.zip = 75240;
        obj.timeZone = "CST";




    }


}
