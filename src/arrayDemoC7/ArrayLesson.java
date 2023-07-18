package arrayDemoC7;

            public class ArrayLesson {
//    single variable can hold only one value
//    What is characteristic of ARRAY?- Holds multiple values and fixed in length
//  unable to add or remove any value in the middle of script
//    constructor always holds data likewise number
//    Very common interview question-What are the java exception you have encountered
//    1. Array Index of bounds exception-length is fixed (Array length is assigned 3 and calling 4)
//                2. Number format exception when converting string word to number



                String name[] = {"Bashir", "Akshara", "Tarikuzzaman"};
                int experiences[] = {5, 10, 15};


//    public  void arrayDemo1(){
//        System.out.println("The name of the teacher is  "+name[0]);
//        System.out.println ("The name of the teacher is  "+name[1]);
//        System.out.println("The name of the teacher is  "+name[2]);
                // System.out.println("The name of the teacher is  "+name[3]);


                //         Loop

//        for(int i=0; i<3;i++){
//            System.out.println(name[i]);
//            }
//        OR


//        for(int i=0; i<lengthOfArray;i++){
//            System.out.println(name[i]);
  //          }

//              for each loop
//             for(String studentsName:name) {
//                 System.out.println(studentsName);
//             }
//
//                 int lengthOfArray = name.length;
//                 System.out.println(lengthOfArray);

            public  void arrayDemo1(){ //  QQ_ how to create for loop and for each loop with integer value
        System.out.println("The name of the teacher is  "+name[0]+ "working experience is "+experiences[0]  + "years");
        System.out.println ("The name of the teacher is  "+name[1]+ "working experience is "+experiences[1]  + "years");
        System.out.println("The name of the teacher is  "+name[2]+ "working experience is "+experiences[2]  + "years");

                int lengthOfArray = name.length;
                System.out.println(lengthOfArray);


//        // Loop
                for(int i=0; i<lengthOfArray;i++){
                    System.out.println(name[i]+experiences[i]);

                }
//
                // For each loop

//                for(String instructorName:name){
//                    System.out.println(instructorName);
//                }


    }


    public static void main(String[] args) {
        ArrayLesson obj = new ArrayLesson();
    obj.arrayDemo1();


    }


}



//ArrayList
// complete