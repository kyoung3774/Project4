package loop.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int num;
		int sum = 0;

		for (num = 1; num <= 100; num++) {
			sum = sum + num;
			if (sum >= 500) {
				System.out.println("바른) num: " + num + ", sum: " + sum);
				break;
			}
			System.out.println("잘못된) num: " + num + ", sum: " + sum);
		}
		System.out.println("최종) num: " + num + ", sum: " + sum);
	}

}
