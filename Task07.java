package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task07 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        System.out.println("Üç adet sayı giriniz..");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();
        System.out.println("En küçük sayı = "+enKucukBul(sayi1, sayi2, sayi3));


    }

    public static int enKucukBul(int a,int b,int c) {
        int enKucukSayi=Math.min(a,b);
        if (c<enKucukSayi) enKucukSayi=c ;
        return enKucukSayi;
    }
}

