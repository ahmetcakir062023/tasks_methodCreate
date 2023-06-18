package ch10_MethodCreation.tasks10;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz
        System.out.println(degisiklik());


    }
    public static String degisiklik(){
        System.out.println("Ad ve Soyadınızı giriniz.");
        String adSoyad=input.nextLine();
        if (adSoyad.length()>1) {
            String yeniİsim = adSoyad.substring(0, 1).toUpperCase() + adSoyad.substring(1).toLowerCase();
            return yeniİsim;
        }else return "Tekrar metin giriniz";

    }

}
