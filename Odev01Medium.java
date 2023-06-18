package ch10_MethodCreation.tasks10;

import java.util.Random;
import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen max bir değer giriniz.");
        int max=input.nextInt();
    int randomNumber=randomNum(max);
        System.out.println("Random number between 0 and " + max +":"+randomNumber);

    }

    public static int randomNum(int max) {
       Random random=new Random();
       return random.nextInt(max+1);
    }
}
