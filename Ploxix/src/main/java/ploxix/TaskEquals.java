package ploxix;

import java.util.Scanner;


public class TaskEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a==b){
            System.out.println("a равно b");
        } else {
            int result = a > b ? a: b;
            System.out.println("Результат сравнения " + result);
            System.out.println("Сумма " + (a + b));
            System.out.println("Разность " + (a - b));
            System.out.println("Произведение " + a * b);
            System.out.println("Частное " + a / b);
        }
    }
}