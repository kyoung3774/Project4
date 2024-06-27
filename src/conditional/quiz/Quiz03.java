package conditional.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		char gender = 'F';
		String gender2 = "M";
		
		if(gender == 'F') {
			System.out.println("여성업니다.");
		} else {
			System.out.println("남성입니다.");
		}
		
		if(gender2.equals("F")) {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
	}

}
