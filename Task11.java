package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task11 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        System.out.println("Lütfen bir metin giriniz.");
        String metin=input.nextLine();
        System.out.println(dönüstür(metin.toLowerCase()));



    }

    private static String dönüstür(String str) {
        String cevrilmisMetin="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char karekter=str.charAt(i);
            char cevrilmisKarekter=karekter;
            switch (str.charAt(i)){
                case 's':
                    cevrilmisKarekter='5';
                    break;
                case 'a':
                    cevrilmisKarekter='4';
                    break;
                case 'e':
                    cevrilmisKarekter='3';
                    break;
                case 'i':
                    cevrilmisKarekter='1';
                    break;
                case 'o':
                    cevrilmisKarekter='0';
                    break;
            }
            cevrilmisMetin+=cevrilmisKarekter;

        }
            return cevrilmisMetin;

    }


}