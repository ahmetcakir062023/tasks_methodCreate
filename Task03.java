package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task03 {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		System.out.println("Saati giriniz..");
		int hour= input.nextInt();
		System.out.println("mili giriniz..");
		double mile= input.nextDouble();
		System.out.println("Kilogramı giriniz..");
		double kg= input.nextDouble();
		System.out.println(hour+" saat ="+hourToSecond(hour)+ " saniyedir");
		System.out.println(mile+" mil = "+milertoKilometre(mile)+" kilometredir");
		System.out.println(kg+" kilogram = "+kilogramToGram(kg)+" gramdır");

	}

	public static double kilogramToGram(double kg) {
		return kg*1000;
	}

	public static double milertoKilometre(double mile) {
		return mile*1.609;
	}

	public static int hourToSecond(int hour) {

		return hour*3600;
	}


}
