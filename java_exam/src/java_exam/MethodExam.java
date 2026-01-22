package java_exam;

public class MethodExam {

	
	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
	}
	
	public static void printMyName(String name) {
		System.out.println("제 이름은 " + name +" 입니다.");
		
		if(name.length() < 3) {
			return;
		}
		
		System.out.println("제 이름은 " + name.length() + "글자 입니다.");
	}
	
	// 프로그램이 실행될 수 있는 메소드를 생성한다
	public static void main( String[] args ) {
		
		int resultAdd = computeAdd(19, 21);
		System.out.println(resultAdd);
		
	//	System.out.println("제 이름은 신유철 입니다.");
	//	System.out.println("제 이름은 땡땡땡 입니다.");
	//	System.out.println("제 이름은 OOO 입니다.");
		printMyName("신유철");
		printMyName("땡땡땡");
		printMyName("OOO");
		
		
	}
	
	
	
}
