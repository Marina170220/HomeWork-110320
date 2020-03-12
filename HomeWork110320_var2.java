package KompjuterIya.Lesson110320;

import java.util.Scanner;

public class HomeWork110320_var2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        int num = s.nextInt();
        int reflex = 0;

        while (num != 0) {
            reflex = reflex*10+(num %10);
            num/=10;
        }
        System.out.println(reflex);
    }
}


