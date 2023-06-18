package ch10_MethodCreation.tasks10;

import java.util.Scanner;

import static deneme.crud.cıkıs;

public class Task05 {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..
        System.out.println("İlk sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();
        menu1(sayi1,sayi2);


    }

    public static void menu1(int sayi1,int sayi2) throws InterruptedException {
        System.out.print("Merhabalar Hoşgeldiniz...\n");
        System.out.print("*");
        Thread.sleep(1500);
        System.out.print("*");
        Thread.sleep(1500);
        System.out.print("*");
        Thread.sleep(1500);
        System.out.print("*");
        Thread.sleep(1500);
        System.out.print("*");
        Thread.sleep(1500);

        System.out.println("Toplama için 1 i\n Çıkarma için 2 yi \n Çarpma için 3 ü \n Bölme için 4 ü tuşlayın \n cıkıs için 5 i tuşlayın");
        int secim = input.nextInt();

        switch (secim) {

            case 1:
                System.out.println(topla(sayi1, sayi2));
                menu1(sayi1,sayi2);
                break;
            case 2:
                System.out.println(cıkar(sayi1, sayi2));
                menu1(sayi1,sayi2);
                break;
            case 3:
                System.out.println(carp(sayi1, sayi2));
                menu1(sayi1,sayi2);
                break;
            case 4:
                System.out.println(böl(sayi1, sayi2));
                menu1(sayi1,sayi2);
                break;
            case 5:
                cıkıs();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                menu1(sayi1,sayi2);
                break;
        }
    }


    public static int böl(int a, int b) {

        if (a < b) return a / b;
        else return b / a;
    }

    public static int carp(int a, int b) {
        return a * b;
    }

    public static int cıkar(int a, int b) {
        if (a < b) return b - a;
        else return a - b;
    }

    public static int topla(int a, int b) {
        return a + b;
    }
}
