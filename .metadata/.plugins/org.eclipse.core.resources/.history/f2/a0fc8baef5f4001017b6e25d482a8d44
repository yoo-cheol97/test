package java_exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner keyboard = new Scanner(System.in);
		
		int inputNumber = 0; // 사용자가 입력하는 숫자가 여기에 들어온다
		
		// 사용자가 입력하는 값이 100이하 일 동안만 {..} 실행해라
		while (inputNumber <= 100) {
			
			// 사용자로부터 정수를 입력받는다
			inputNumber = keyboard.nextInt();
			System.out.println(inputNumber);
			
		}
		
		System.out.println("Application을 종료합니다.");*/
		
		Scanner keyboard = new Scanner(System.in);
		double randomNumber = Math.random();
		int answer = (int) (randomNumber * 100);
		int value = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요. ");
			value = keyboard.nextInt();
			if(answer == value) {
				System.out.println("정답입니다!");
				break;
			}
			else if (answer > value) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Down!");
			}
		}
		
	}

}
