package loop.quiz;

public class Quiz08 {

	public static void main(String[] args) {
		int i;
		int j;

		for (i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("----" + i + "단----");
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}
		System.out.println("continue끝");

		for (i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				for (j = 1; j <= 9; j++) {
					System.out.println(i + "x" + j + "=" + (i * j));
				}
			}
			System.out.println();
		}
	}

}
