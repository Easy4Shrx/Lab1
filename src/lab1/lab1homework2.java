package lab1;

import java.util.Scanner;

public class lab1homework2 {
    public static void main(String[] args) {
        Double y,x,a,b,d;
        System.out.print("Введите значение х= ");
        x=new Scanner(System.in).nextDouble();
        System.out.print("Введите значение b= ");
        b=new Scanner(System.in).nextDouble();
        System.out.print("Введите значение a= ");
        a=new Scanner(System.in).nextDouble();
        System.out.println("Формула 1");
        if(x != 0 && a != 0 ){
            y=a*b*Math.pow(x,2)-(a/Math.pow(Math.sin(x/a),2));
            System.out.println("Ответ первой формулы y= "+y);
        }else System.out.println("Данные не входят в ОДЗ x!=0 и a!=0");
        System.out.println("Формула 2");;
        if(a >= 0){
            d = a*Math.pow(Math.E,Math.sqrt(a))*Math.cos((b*x)/a);
System.out.println("Ответ второй формулы d= " +d);
        }else System.out.println("Данные не входят в ОДЗ а>=0 ");

    }

}
