package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task08 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */   char secim='Y';
        while (secim=='Y'&&secim!='N' ) {
            System.out.println("Lütfen girmek istediğiniz yılı yazınız");
            int yil = input.nextInt();
            String artıkYılMi = artıkYilmi(yil);
            System.out.println(artıkYılMi);
            System.out.println("Devam etmek isterseniz Y \n bitirmek isterseniz N ya basınız");
            secim=input.next().charAt(0);
        }

    }

    public static String artıkYilmi(int year) {
        if ((year%400==0)||(year%4==0&&year%100!=0) ) {
            return "Artık yıldır";
        }else return "Artık yıl değildir";
    }


}
