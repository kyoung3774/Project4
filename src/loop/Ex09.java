package loop;

public class Ex09 {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		
		//break는 특정조건에서 반복문을 빠져나와야 할 때 사용
		for (i = 1; i <= 20; i++) {
			sum = sum + i;
			System.out.println("i: " + i +", sum: " + sum);
			if (sum >= 100) {
				break;
			}
		}
		System.out.println();
		System.out.println("i: " + i);
		System.out.println("sum: " + sum);
	}

}
