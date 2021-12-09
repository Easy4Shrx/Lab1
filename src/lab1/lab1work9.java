package lab1;

import java.util.Scanner;

public class lab1work9 {
    public static void main(String[] args) {
        double a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3, x, y, z, delta, delta1, delta2, delta3;
        System.out.println("Заполните матрицу: ");
        System.out.print("a1 = ");
        a1 = new Scanner(System.in).nextDouble();
        System.out.print("a2 = ");
        a2 = new Scanner(System.in).nextDouble();
        System.out.print("a3 = ");
        a3 = new Scanner(System.in).nextDouble();
        System.out.print("b1 = ");
        b1 = new Scanner(System.in).nextDouble();
        System.out.print("b2 = ");
        b2 = new Scanner(System.in).nextDouble();
        System.out.print("b3 = ");
        b3 = new Scanner(System.in).nextDouble();
        System.out.print("c1 = ");
        c1 = new Scanner(System.in).nextDouble();
        System.out.print("c2 = ");
        c2 = new Scanner(System.in).nextDouble();
        System.out.print("c3 = ");
        c3 = new Scanner(System.in).nextDouble();
        System.out.print("d1 = ");
        d1 = new Scanner(System.in).nextDouble();
        System.out.print("d2 = ");
        d2 = new Scanner(System.in).nextDouble();
        System.out.print("d3 = ");
        d3 = new Scanner(System.in).nextDouble();
    System.out.println( +a1+"*x+"+b1+"*y+"+c1+"*z"+"="+d1 );
    System.out.println( +a2+"*x+"+b2+"*y+"+c2+"*z"+"="+d2 );
    System.out.println( +a3+"*x+"+b3+"*y+"+c3+"*z"+"="+d3 );

        delta = a1 * b2 * c3 + b1 * c2 * a3 + c1 * a2 * b3 - c1 * b2 * a3 - b1 * a2 * c3 - a1 * c2 * b3;
        delta1 = d1 * b2 * c3 + b1 * c2 * d3 + c1 * d2 * b3 - c1 * b2 * d3 - b1 * d2 * c3 - d1 * c2 * b3;
        delta2 = a1 * d2 * c3 + d1 * c2 * a3 + c1 * a2 * d3 - c1 * d2 * a3 - d1 * a2 * c3 - a1 * c2 * d3;
        delta3 = a1 * b2 * d3 + b1 * d2 * a3 + d1 * a2 * b3 - d1 * b2 * a3 - b1 * a2 * d3 - a1 * d2 * b3;
        if (delta != 0) {
            x = delta1 / delta;
            y = delta2 / delta;
            z = delta3 / delta;
            System.out.println("x = " + x + " y = " + y + " z = "+ z);
        } else
            System.out.println("Ошибка.Определитель равен нулю");
    }
}