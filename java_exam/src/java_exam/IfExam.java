package java_exam;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumber = (int) (Math.random() * 100);
		System.out.println(randomNumber);
		
		// randomNumber == 16 : "10범위의 숫자가 나왔습니다."
		// randomNumber == 36 : "30범위의 숫자가 나왔습니다."
		// randomNumber == 66 : "60범위의 숫자가 나왔습니다."
		// randomNumber == 6 :  "0범위의 숫자가 나왔습니다."
		// randomNumber == 27 : "20범위의 숫자가 나왔습니다."
		// randomNumber == 55 : "50범위의 숫자가 나왔습니다."
		
		int radix = randomNumber / 10 * 10;
		System.out.println(radix + "범위의 숫자가 나왔습니다.");
		
		// if로 풀어보기
		if (randomNumber >= 10 && randomNumber < 20 ) {
			System.out.println("10범위의 숫자가 나왔습니다. - if");	
		}
		else if ( randomNumber >= 20 && randomNumber < 30 ) {
			System.out.println("20범위의 숫자가 나왔습니다. - if");
		}
		else if ( randomNumber >= 30 && randomNumber < 40 ) {
			System.out.println("30범위의 숫자가 나왔습니다. - if");
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
		
		randomNumber = 78;
		
		if (randomNumber >= 90) {
			System.out.println("90 범위의 숫자입니다.");
		}
		else if (randomNumber >= 80) {
			System.out.println("80 범위의 숫자입니다.");
		}
		else if (randomNumber >= 70) {
			System.out.println("70 범위의 숫자입니다.");
		}
		else if (randomNumber >= 60) {
			System.out.println("60 범위의 숫자입니다.");
		}

		

	}

}
