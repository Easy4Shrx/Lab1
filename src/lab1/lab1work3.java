package lab1;

import java.util.Scanner;

public class lab1work3 {
    public static void main(String[] args) {
        System.out.print("Часы= ");
        double h = new Scanner(System.in).nextDouble();
        System.out.print("Минуты= ");
        double m = new Scanner(System.in).nextDouble();
        System.out.print("Секунды= ");
        double s = new Scanner(System.in).nextDouble();
        double inj;

        if (h >= 0 && h <= 11 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            inj = (h * 3600 + m * 30 + s) / 120;
//          inj = (h*30 + m *30/60 +s*30/3600);
            System.out.print(" Угол= " + inj);
        } else {
            System.out.println("Ввели не верное время");
        }

    }
}
