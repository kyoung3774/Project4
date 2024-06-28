package loop;

public class Ex08 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 홀수의 합은 " + sum);
	}

}
