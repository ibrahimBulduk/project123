package sayıBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] sayılar = new int[] { 3, 5, 7, 9, 11, 34, 23 };
		System.out.println("Arayacağınız sayıyı giriniz : ");
		int aranacak = scanner.nextInt();
		boolean varmi = false;

		for (int sayi : sayılar) {
			if (sayi == aranacak) {
				varmi = true;
				break;

			}
		}
		if (varmi == true) {
			System.out.println("sayı mevcuttur. ");
		} else {
			System.out.println("sayı mevcut değildir. ");
		}

	}

}
