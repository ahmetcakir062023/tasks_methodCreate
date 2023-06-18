package ch10_MethodCreation.tasks10;

import java.util.Scanner;

import static deneme.crud.cıkıs;

public class Task06 {
   static Scanner input =new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */

        menu_hesap();

        }

    private static void menu_hesap() throws InterruptedException {
        System.out.println("Hoşgeldiniz.... ");
        System.out.print("**");
        Thread.sleep(1500);
        System.out.print("**");
        Thread.sleep(1500);
        System.out.print("**");
        Thread.sleep(1500);
        System.out.print("**\n");
        Thread.sleep(1500);
        System.out.print("Kare için 1 i \n Dikdörtgen için 2 yi \n Üçgen için 3 ü \n cıkış için 4 ü tuşlayın ");
        int secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.println("Karenin kenarını girin");
                int kareKenar=input.nextInt();
                System.out.println("alanKareHesap(kareKenar) = " + alanKareHesap(kareKenar));
                System.out.println("cevreKareHesap(kareKenar) = " + cevreKareHesap(kareKenar));
                menu_hesap();
                break;
            case 2:
                System.out.println("Dikdörtgenin uzun ve kısa kenarını giriniz");
                int uzunKenar=input.nextInt();
                int kısaKenar=input.nextInt();
                System.out.println("alanDikdörtgenHesap(uzunKenar,kısaKenar) = " + alanDikdörtgenHesap(uzunKenar, kısaKenar));
                System.out.println("cevreDikdörtgenHesap(uzunKenar,kısaKenar) = " + cevreDikdörtgenHesap(uzunKenar, kısaKenar));
                menu_hesap();
                break;
            case 3:
                System.out.println("Üçgenin tabanını ve yüksekliğini giriniz.");
                int tabanUcgen=input.nextInt();
                int yukseklıkUcgen=input.nextInt();
                System.out.println("Üçgenin üç kenarını da giriniz.");
                int kenar1=input.nextInt();
                int kenar2=input.nextInt();
                int kenar3=input.nextInt();
                System.out.println("ucgenCevre(kenar1,kenar2,kenar3) = " + ucgenCevre(kenar1, kenar2, kenar3));
                System.out.println("ucgenAlan(tabanUcgen*yukseklıkUcgen) = " + ucgenAlan(tabanUcgen, yukseklıkUcgen));
                menu_hesap();
                break;
            case 4:
                cıkıs();
                break;
            default:
                System.out.println("Hatalı seçim");
                break;
        }
    }


    private static int ucgenAlan(int taban,int yukseklik) {
        return (taban*yukseklik)/2;
    }

    private static int ucgenCevre(int kenar1,int kenar2,int kenar3) {
        return kenar1+kenar2+kenar3;
    }

    private static int cevreDikdörtgenHesap(int uzun,int kısa) {
        return 2*(uzun+kısa);
    }

    private static int alanDikdörtgenHesap(int uzun,int kısa) {
        return uzun*kısa;
    }

    private static int cevreKareHesap(int kenar) {
        return 4*kenar;
    }

    private static int alanKareHesap(int kenar) {
        return kenar*kenar;
    }


}
