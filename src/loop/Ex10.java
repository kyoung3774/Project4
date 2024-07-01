package loop;

public class Ex10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			System.out.println(2 + " x " + i + " = " + (2 * i));
		}
		System.out.println("---------------------------------");

		for (int i = 2; i <= 9; i++) {
			System.out.println("--- " + i + "단 ---");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		System.out.println("\n--- 구구단 종료 ---");
	}

}
