package java_study;

import java.util.Scanner;

public class ScannerEx2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next(); 
        String str2 = in.next();
        in.nextLine(); 
        String str3 = in.nextLine(); 
        String str4 = in.nextLine(); 

        System.out.println(str1); 
        System.out.println(str2); 
        System.out.println(str3); 
        System.out.println(str4); 
    }
    
    
}
