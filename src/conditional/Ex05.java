package conditional;

public class Ex05 {

	public static void main(String[] args) {

		char rank = '1';

		switch (rank) {
		case '1':
			System.out.println("금메달");
			break;
		case '2':
			System.out.println("은메달");
			break;
		case '3':
			System.out.println("동메달");
			break;
		default:
			System.out.println("없메달");
		}
	}

}
