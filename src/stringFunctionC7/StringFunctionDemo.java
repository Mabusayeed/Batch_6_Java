package stringFunctionC7;

public class StringFunctionDemo {

    public static void stringPractice(){

        String name = "Upright";

        int lengthOfMyStrings=name.length();
       System.out.println(lengthOfMyStrings);

//        or shortcut below
//        System.out.println(name.length());

    }

    public static void changeCase(){
        String name = "Upright";
        String upper = name.toUpperCase();
        System.out.println(upper);
        String lower = name.toLowerCase();
        System.out.println(lower);
    }

    public static void splitString(){

        String schoolName = "Upright_Tech Solution";
        String[] arrayOfSchoolName = schoolName.split("_");
        System.out.println(arrayOfSchoolName.length);
        System.out.println(arrayOfSchoolName[0]);
        System.out.println(arrayOfSchoolName[1]);

        //Homework
        System.out.println("--------------"); // QQ- limit means here?
        String schoolName1 = "Upright Tech Solution";
        String[] arrayOfSchoolName1 = schoolName.split(" ",2);
        System.out.println(arrayOfSchoolName.length);
        System.out.println(arrayOfSchoolName[0]);
        System.out.println(arrayOfSchoolName[1]);


    }
    public static void stringInt(){
        String money = "50";
       // System.out.println(money+100);
        Integer.parseInt(money);
        int money1 = Integer.parseInt(money);
        System.out.println(money1+100);
    }

    public static void intToString(){

        int money = 200;
        System.out.println(money+100);
        String newMoney = String.valueOf(money);
        System.out.println(newMoney+100);
    }






    public static  void main(String[] args) {
       // stringPractice();
      //  changeCase();
        splitString();
       // stringInt();
//        intToString();
    }


}

// complete
