package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task01 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...
        boolean aynıMı=esitMi();
        System.out.println("Girdiğiğiniz sayılar " + (aynıMı?"eşittir":"eşit değldir"));
    }
    public static boolean esitMi(){
        System.out.println("İlk Sayiyi giriniz.");
        int sayi1=input.nextInt();
        System.out.println("İkinci Sayiyi giriniz.");
        int sayi2=input.nextInt();
        if (sayi1==sayi2) return true;
        else return false;
    }


}
