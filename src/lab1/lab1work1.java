package lab1;

import java.util.Scanner;

public class lab1work1 {
    public static void main(String[] args) {
    System.out.println("Введите дробное число: ");
        double in = new Scanner(System.in).nextDouble();
        in= in * 10;
        int d = (int) in;
        d=d % 10;
    System.out.print("Первая цифра из дробной части: " +d);
    }
}
