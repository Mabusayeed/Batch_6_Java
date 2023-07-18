package arrayPractice;

public class ArrayDemoPractice {
    String name []  = {"John","David","Smith"};
    int[] workingExperience = {5,10,15};

    public  void arrayDemo1() {
//        System.out.println("My name is " +name[0]);
//        System.out.println("My name is " +name[1]);
//        System.out.println("My name is " +name[2]);



        for (int i=0; i< name.length;i++){ // Q-variables lengthOfArray not recognized!
            System.out.println(name[i]) ;
        }


//            for(String teachersName:name){
//                System.out.println(teachersName);
//            }


        int lengthOfArray= name.length;
        System.out.println(lengthOfArray);
        }




    public static void main(String[] args) {

        ArrayDemoPractice obj= new ArrayDemoPractice();
        obj.arrayDemo1();

    }




}
