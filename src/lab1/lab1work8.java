package lab1;

import java.util.Scanner;

public class lab1work8 {
    public static void main(String[] args) {
    System.out.println("Введите х= ");
        float x= new Scanner(System.in).nextFloat();
        float d;
        d=(((3*x-5)*x+2)*x-1)*x+7;
    System.out.println("Ответ: " +d);
    }
}
