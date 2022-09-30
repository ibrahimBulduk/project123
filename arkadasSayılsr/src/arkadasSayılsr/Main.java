package arkadasSayılsr;

public class Main {

	public static void main(String[] args) {
		// arkadaşSayılar
		
				int number1 = 1184;
				int number2 = 1210;
				int sayaç1 = 0;
				int sayaç2 = 0;

				for (int i = 1; i < number1; i++) {
					if (number1 % i == 0) {
						sayaç1 = sayaç1 + i;
					}

				}
				if (sayaç1 == number2) {
					for (int l = 1; l < number2; l++) {
						if (number2 % l == 0) {
							sayaç2 = sayaç2 + l;
						}
					}
					if (sayaç2 == number1) {
						System.out.println("arkadaş sayılardır !");
					} else {
						System.out.println("arkadaş sayı değildirler !");
					}
				} else {
					System.out.println("arkadaş sayı değildirler !");
				}
				System.out.println((sayaç1));
				System.out.println((sayaç2));

	}

}
