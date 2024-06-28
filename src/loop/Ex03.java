package loop;

public class Ex03 {

	public static void main(String[] args) {

		int sum = 0;

		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

		int sum2 = 0;
		int num = 1;
		
		while (num <= 10) {
			sum2 = sum2 + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum2+ "입니다.");
	}
}
