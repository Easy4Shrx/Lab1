package lab1;

import java.util.Scanner;

public class lab1work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k ;
        System.out.print("Введите секунды=");
        k = in.nextInt();
        int hourCount = k / 3600;
        int minCount = (k % 3600) / 60;
        int secCount = ((k % 3600) % 60);
        System.out.print("Прошло " + hourCount + " ч.  " + minCount + " мин. и " + secCount + " сек." );


    }
   }
//

