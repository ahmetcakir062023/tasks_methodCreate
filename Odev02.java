package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Odev02 {




	static int count=0;
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir metin giriniz.");
		 String metin = input.nextLine();
		 int rakamSayisi=rakamHesap(metin);
		System.out.println("rakamSayisi = " + rakamSayisi);


	}

	public static int rakamHesap(String str) {
		for (int i = 0; i <=str.length()-1 ; i++) {
			if (Character.isDigit(str.charAt(i))){
				count++;
			}
		}
		return count ;
	}
}

