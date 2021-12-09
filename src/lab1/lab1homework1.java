package lab1;

import java.io.PrintStream;
import  java.util.Scanner;

public class lab1homework1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данныые: ");
        System.out.println("Перечисляемый тип: 1)Х-Художественная лит-ра; 2)У-учебная лит-ра; 3)С-справочная лит-ра; ");
            System.out.print(" Введите автора книги : ");
            String autor1 = scanner.next();
            System.out.print(" Введите название: ");
            String book1 = scanner.next();
            System.out.print(" Введите год выпуска: ");
            int year1 = scanner.nextInt();
            System.out.print(" Введите группу:  ");
            String  group1 = scanner.next();
            System.out.print(" Введите автора книги : ");
            String autor2 = scanner.next();
            System.out.print(" Введите название: ");
            String book2 = scanner.next();
            System.out.print(" Введите год выпуска: ");
            int year2 = scanner.nextInt();
            System.out.print(" Введите группу:  ");
            String group2 = scanner.next();
            System.out.print(" Введите автора книги : ");
            String autor3 = scanner.next();
            System.out.print(" Введите название: ");
            String book3 = scanner.next();
            System.out.print(" Введите год выпуска: ");
            int year3 = scanner.nextInt();
            System.out.print(" Введите группу:  ");
            String group3 = scanner.next();

            System.out.format("+------------------------------------------------------------------------------------+%n");
            System.out.format("|Каталог библиотеки                                                                  |%n");
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|Автор                         |Название                     | Год        |Группа    |%n");
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|%-30s|%-29s|%-12s|%-10s|%n",autor1,book1,year1,group1);
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|%-30s|%-29s|%-12s|%-10s|%n",autor2,book2,year2,group2);
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|%-30s|%-29s|%-12s|%-10s|%n",autor3,book3,year3,group3);
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|%-30s|%-29s|%-12s|%-10s|%n",autor1,book1,year1,group1);
            System.out.format("|------------------------------------------------------------------------------------|%n");
            System.out.format("|Перечисляемый тип: Х-Художественная лит-ра; У-учебная лит-ра; С-справочная лит-ра;  |%n");
            System.out.format("+------------------------------------------------------------------------------------+%n");

        }
}