package lab1;

import java.util.Scanner;

public class lab1work6 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
        int x = new Scanner(System.in).nextInt();
//        int x1 = x
        int x1 =  x/1000;
        int x2 =  (x/100)%10;
        int x3 =  (x/10)%10;
        int x4 =   x%10;
        int nul=1;
                while (x > 0){
                    nul *= x % 10;
                    x /= 10;
                }
    System.out.println("Произведения чисел " + x1 + " * " + x2 + " * " + x3 + " * " + x4 +  " Состовляет= " + nul );
//    System.out.println("Произведение введеного  числа " + x1 + " Состовляет= " + nul )
    }
}
