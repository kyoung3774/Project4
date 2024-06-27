package conditional;

public class Ex06 {

	public static void main(String[] args) {

		String rank = "1";

		switch (rank) {
		case "1":
			System.out.println("금메달");
			break;
		case "2":
			System.out.println("은메달");
			break;
		case "3":
			System.out.println("동메달");
			break;
		default:
			System.out.println("없메달");
		}
		
		//switch문은 실수타입을 사용 할 수 없다.
//		float r = 1.1f;
//		
//		switch (r) {
//		case 1.5f:
//			break;
//		}
	}

}
