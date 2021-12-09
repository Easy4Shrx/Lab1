package lab1;

import java.util.Scanner;

public class lab1work5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double a, b, c, P, S ;
    System.out.print("Введите катет a=");
        a= vvod.nextDouble();
    System.out.print("Введите катет b=");
        b= vvod.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("Гипотенуза с=" +c);
        P = a+b+c;
    System.out.println("Периметр P=" +P);
        S =(a*b)/2;
    System.out.println("Площадь S=" +S);
    }
}
