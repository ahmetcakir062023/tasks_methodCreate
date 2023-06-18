package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task12 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        System.out.println("Lütfen e mail giriniz..");
        String eMail=input.nextLine();
        System.out.println("mailiniz doğru mudur= "+isValidate(eMail));


    }

    public static boolean isValidate(String str) {
        if (str.contains("@")&&str.contains(".")){
            int atİndex=str.indexOf("@");
            int noktaİndex=str.indexOf(".");
        if (atİndex>0&&atİndex<noktaİndex&&noktaİndex<str.length()-1){
            return true;
        }
        }
        return false;

    }


}