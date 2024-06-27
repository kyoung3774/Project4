package conditional.quiz;

public class Quiz04 {

	public static void main(String[] args) {

		int i = 200;
		
		if((i>=100) && (i<=200)) {
			System.out.println(i + "는 100이상 200이하입니다.");
		} else {
			System.out.println(i + "는 100미만 또는 200초과입니다.");
		}
	}

}
