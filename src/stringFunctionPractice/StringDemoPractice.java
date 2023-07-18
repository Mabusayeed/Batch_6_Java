package stringFunctionPractice;


public class StringDemoPractice {


    public static void subString1() {

        String name = "Uprighttechsolution@gmail.com";// Hmwrk-1

        name.substring(7, 11);
        String newName = name.substring(7, 11);
        System.out.println(newName);


    }

    public static String subString2() { // returning method without void-execute without print
        String name1 = "Uprighttechsolution@gmail.com";
        name1.substring(7, 11);
        String newName1 = name1.substring(7, 11);
//        System.out.println(newName1); " not correct way
        return newName1;

    }

    public static void replaceDemo() {
        String email = "Uprighttechsolution_gmail.com";

        email.replace("_", "@");
        String newName2 = email.replace("_", "@");
        System.out.println(newName2);

    }

    public static void replaceDemo1() {
        String name2 = "Ups_Down";

        name2.replace("_", "@");// replace with "a" or "and"
        String newName3 = name2.replace("_", "and");
        System.out.println(newName3);

    }

    public static void reverseDemo() {
        String name3 = "Badal";

        System.out.println(name3.charAt(3));// for individual character
    }

    public static void reverseDemo1() {
        // for whole word using the loop concept

        String name4 = "Beautiful";

        for (int i = name4.length() - 1; i >= 0; i--) {

            System.out.print(name4.charAt(i));

        }
    }

    public static void reverseBuffer() {
        String name5 = "Beautiful";

        StringBuffer sbValue = new StringBuffer(name5);
        sbValue.reverse();
        System.out.println(sbValue);

    }

    public static void palindromeDemo() {

        String name = "Madam";
        String rev = ""; // variable for validation of palindrome

        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);
//            System.out.print(name.charAt(i)); // just print reverse Palindrome
        }
        if (name.equalsIgnoreCase(rev)) { // Validation of Palindrome
            System.out.println("This is correct");
        } else {
            System.out.println("This is not correct");
        }

    }

    public static String subString3() {
        String name = "Uprighttechsolution@gmail.com";// Hmwrk-1
        name.substring(19, 20);

        String newText = name.substring(19, 20);

        System.out.println(newText);
        return newText;

    }



    public static void main(String[] args) {
////        subString1();
//        subString2();// not the correct way to call and print return variables
//        String printNewName1 = subString2();// "printNewName" hold string variables
//        System.out.println(printNewName1);// commonly print for return variables
//
////        Validation of the return
//        if(printNewName1.equalsIgnoreCase("tech")){
//            System.out.println("String is good");
//
//        }
//        else{
//            System.out.println("Please check back the string");
//        }

//        replaceDemo();
//        replaceDemo1();
//        reverseDemo1();
//        palindromeDemo();
        String printNewText = subString3(); // QQ- possible to validate sub method instead of main method
        if (printNewText.equalsIgnoreCase("@")) {
            System.out.println("String is ok");// QQ- =="@" provides incorrect result
        } else {
            System.out.println("String is not ok");
        }

        System.out.println("----------------");

        String input = "my name is sayeed";
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                output.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                output.append(Character.toLowerCase(currentChar));
            }

        }
        String finalOutPut = output.toString();
        System.out.println(finalOutPut);

        System.out.println("-----------");

            String name = "my name is sayeed";
            StringBuilder titleCaseName = new StringBuilder();
             boolean capitalizeNext1 = true;


        for (char c : name.toCharArray()) {

                if (Character.isWhitespace(c)) {
                    capitalizeNext1 = true;
                }
                else if (capitalizeNext1) {
                    c = Character.toUpperCase(c);
                    capitalizeNext1 = false;
                }
                else {
                    c = Character.toLowerCase(c);
                }
                    titleCaseName.append(c);
                }


        System.out.println(titleCaseName.toString());

    }
}



