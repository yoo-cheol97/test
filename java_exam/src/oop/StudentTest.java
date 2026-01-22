package oop;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.java = 80;
		student.python = 95;
		student.cpp = 85;
		student.csharp = 75;
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double course = student.getCourseCredit();
		String course2 = student.getABCDF();
		
		System.out.println("학점의 합은 " + sum + "점 입니다");
		System.out.println("학점의 평균은 " + average + "점 입니다");
		System.out.println("학점은 " + course +"점 입니다");
		System.out.println("학점은 " + course2 + "입니다");
	}
}
