package conditional.quiz;

public class Quiz08 {

	public static void main(String[] args) {

		int score = 88;
		
		switch(score/10) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
		}
	}

}
