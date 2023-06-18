package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task09 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        System.out.println("Lütfen saati giriniz..");
        int saat=input.nextInt();
        System.out.println(saat+" saat = "+hourToSecond(saat)+" saniyedir");
    }

    public static int hourToSecond(int hour ) {
        return hour*3600;

    }
}
