package conditional.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int studentScore = 69;
		
		if(studentScore >= 90 && studentScore <= 100) {
			System.out.println("수");
		}else if(studentScore >= 80) {
			System.out.println("우");
		}else if(studentScore >= 70) {
			System.out.println("미");
		}else if(studentScore >= 0 ) {
			System.out.println("양");
		}else if(studentScore>=101 || studentScore<0) {
			System.out.println("없는점수");
		}
	}

}
