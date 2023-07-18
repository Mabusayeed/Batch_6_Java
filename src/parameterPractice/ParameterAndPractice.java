package parameterPractice;

public class ParameterAndPractice {

    public int add(int x, int y){

        int a =  x+y;

        return a;

    }

    public int substract (int x, int y){

        int a = x-y;

        return a;

    }

    public int multiple(int x, int y){
        int a = x*y;
        return a;


    }
    public int division(int x, int y){
        int a = x/y;

        return a;
    }

    public String studentName(String name){
        return name;

    }

    public boolean gender(boolean yourGender){
        return yourGender;
    }

    public static void main(String[] args) {
        ParameterAndPractice value = new ParameterAndPractice();
        int newValue= value.add(10, 5);
        System.out.println(newValue);

        System.out.println("-----------");
      ParameterAndPractice value1 = new ParameterAndPractice();
      int substractValue = value1.substract(10,5);
        System.out.println(substractValue);

        System.out.println("----------");
        ParameterAndPractice value2 = new ParameterAndPractice();

                int multipleValue = value2.multiple(10,5);
        System.out.println(multipleValue);

        System.out.println("----------");
        ParameterAndPractice value0 = new ParameterAndPractice();
        int divisionValue = value0.division(30,10);
        System.out.println(divisionValue);

        System.out.println("-------");
        ParameterAndPractice value3 = new ParameterAndPractice();
        String studentNameHolder = value3.studentName("Sayeed");
        System.out.println(studentNameHolder);

        System.out.println("--------");
        ParameterAndPractice value4 = new ParameterAndPractice();
        value4.gender(true);
        boolean genderHolder = value4.gender(true);
        System.out.println(genderHolder);

    }

}
