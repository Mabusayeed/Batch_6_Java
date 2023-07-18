package collectionFrameWorkC12;

import myFirstPackage.Students;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public void ListPractice(){


        List<String > students = new ArrayList<>();
        Boolean isEmptyBeforeAdd = students.isEmpty();
        System.out.println("Empty before adding elements "+ isEmptyBeforeAdd);






//        students.add("Terry");
//        students.add("Marry");
//        students.add("Sherry");
//        students.add("Terry");
//        students.add("Holly");
//        students.add("Molly");
//        students.add("Polly");
//        students.add("Jerry");




    }

    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.ListPractice();

    }



}
