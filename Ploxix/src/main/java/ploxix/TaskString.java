package ploxix;

import java.util.Scanner;


public class TaskString {public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
     String a = scan.nextLine();
     String b = scan.nextLine();
     boolean result = a.equals(b);
     if (result){
         System.out.println("Строки идентичны");
     }else {
         System.out.println("Строки неидентичны");
     }
}
}
