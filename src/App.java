public class App {

	public static void main(String[] args) {

		for (int i = 100; i < 500; i++) {
			for (int j = i; j < 500; j++) {
				for (int k = j; k < 500; k++) {
					if ((i * i) + (j * j) == (k * k)) {
						if (i + j + k == 1000) {
							System.out.println(i + " squared + " + j
									+ " squared = " + k + " squared");
							System.out.println("Their product is " + i * j * k);
						}
					}
				}
			}
		}

	}
}
