package exam;

public class ArtithmaticQuiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
		int totalScore = 0; //모든 과목들의 합
		double average = 0; //평균 점수
		double score = 0; //4.5점 만점 기준 학점 계산. 소수점 이하 두 자리 까지
							//평균 점수 - 55에서 소수점 계산
		
		totalScore = subjectA + subjectB + subjectC + subjectD;
		average = totalScore / 4d;
		score = (average - 55);
		//score = score / 10;
		
		score = score * 10;
		score = Math.round(score);
		score = score / 100;
				
		System.out.println("점수 총합: " + totalScore);
		System.out.println("점수 평균: " + average);
		System.out.println("학점 결과: " + score);
		
		

	}

}
