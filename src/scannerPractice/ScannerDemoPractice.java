package scannerPractice;

import com.sun.tools.javac.Main;
import scannerDemoC5.ScannerPractice;

import java.util.Map;
import java.util.Scanner;

public class ScannerDemoPractice {

    public void scanP(){
        System.out.println("Hello");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String newNameP = scan.nextLine();
        System.out.println("I read my name from console " +newNameP);


    }


    public static void main(String[] args) {
        ScannerDemoPractice obj = new ScannerDemoPractice();
        obj.scanP();
    }









}


