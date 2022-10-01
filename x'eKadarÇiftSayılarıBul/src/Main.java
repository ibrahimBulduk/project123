
public class Main {

	public static void main(String[] args) {
		int x = 50000;
		for (int i = 1; i < x; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
			if (i == 200) {
				break;
			}

		}
	}

}
