package loop.quiz;

public class Quiz05 {

	public static void main(String[] args) {
		int i;
		int j;

		// continue를 사용
		for (i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("최종: " + i);
		System.out.println("--------------------------");

		// continue를 비사용
		for (j = 1; j <= 100; j++) {
			if (j % 3 == 0) {
				System.out.println(j);
			}
		}

	}

}
