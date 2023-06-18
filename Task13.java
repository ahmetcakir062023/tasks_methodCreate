package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */  char secim='E';
        while (secim=='E') {
            System.out.println("İki adet metin giriniz..");
            String metin1 = input.nextLine();
            String metin2 = input.nextLine();
            System.out.println("İkinci yazdığınız metin ilk metinin son harflerine eşit midir " + kontrolEt(metin1, metin2));
            System.out.println("devam etmek istiyorsanız E ye basın");
             secim=input.next().charAt(0);
        }

    }

    public static boolean kontrolEt(String str1, String str2) {
            if (str1.length() < str2.length()) return false;
            int strFarkIndex = str1.length() - str2.length();
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(strFarkIndex + i) != str2.charAt(i)) {
                    return false;
                }
            }
         return true;
        }


    }

