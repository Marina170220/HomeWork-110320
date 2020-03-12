package KompjuterIya.Lesson110320;

import java.util.Scanner;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Введите количество участников ");
        int MembersAmount = s.nextInt();
        System.out.println(r.nextInt(MembersAmount));

    }

}
