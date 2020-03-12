package KompjuterIya.Lesson110320;

import java.util.Scanner;

public class HomeWork110320 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        int num = s.nextInt();

        while (num != 0) {
            System.out.print(num % 10);
            num/=10;
        }
    }
}

