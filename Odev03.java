package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz.");
        int sayi=input.nextInt();

        boolean asalSayiMi=getAsalmi(sayi);
        System.out.println("Sayi asal sayı mıdır = " +asalSayiMi);

    }

    public static boolean getAsalmi(int sayi) {
       if (sayi<=1) return false;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                return false;
            }
        }
        return true;
    }
}

