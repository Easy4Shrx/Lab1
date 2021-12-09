package lab1;

import java.util.Scanner;

public class lab1work7 {
    public static void main(String[] args) {
        System.out.print("Введите число x= ");
        int x = new Scanner(System.in).nextInt();
        int y = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
//        System.out.println("x = " + x);
        System.out.println("В обратном порядке = " + y);
    }
}