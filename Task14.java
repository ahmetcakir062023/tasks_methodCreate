package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task14 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        System.out.println("Başlama saatini giriniz");
        double baslamaSaati=input.nextDouble();
        System.out.println("Bitiş saatini giriniz");
        double bitisSaati=input.nextDouble();
        System.out.println("Saatlik ücreti girin");
        double saatUcret=input.nextDouble();

        System.out.println("Günlük toplam alacağınız ücret = "+ucretHesapla(baslamaSaati, bitisSaati, saatUcret));


    }

    private static double ucretHesapla(double baslamaSaat,double bitisSaat,double saatlikUcret) {
        double fazlaMesai=(9.0-baslamaSaat)+(bitisSaat-17.0);
        if (baslamaSaat>=9.0&&bitisSaat<=17.0){
            return (bitisSaat-baslamaSaat)*saatlikUcret;
        }else{
            return (17.0-9.0)*40.0+fazlaMesai*1.8*40;
        }
    }


}
