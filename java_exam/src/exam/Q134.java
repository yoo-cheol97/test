package exam;

public class Q134 {
	
	public static int getFlightFare(int age) {
		if(age >= 19) {
			return 300_000;
		}
		else {
			return 100_000;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int flightFare = 0;
		flightFare += getFlightFare(father);
		flightFare += getFlightFare(mother);
		flightFare += getFlightFare(daughter);
		
		/*
		// Case1. 비행 요금을 계산
		int flightFare = 0;
		
		if (father >= 19) {
			flightFare += adultOneWayFlightFare;
		}
		else {
			flightFare += kidOneWayFlightFare;
		}
		
		if (mother >= 19) {
			flightFare += adultOneWayFlightFare;
		}
		else {
			flightFare += kidOneWayFlightFare;
		}
		
		if (daughter >= 19) {
			flightFare += adultOneWayFlightFare;
		}
		else {
			flightFare += kidOneWayFlightFare;
		}
		if(flightFare > money) {
			System.out.println("다음에 가자");
		}
		else {
			System.out.println("여행 가자");
		}
		
		// case2. 성인의 수, 아동의 수
		int adultCount = 0;
		int kidCount= 0;
		
		// case3. 비행 요금. 케이스 계산x
		// 삼항 연산 ==> if ~ else 대체 (성능이 다소 느려 권장하지않음)
		
		flightFare = father >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		flightFare += mother >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		flightFare += daughter >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		
		if(flightFare > money) {
			System.out.println("다음에 가자");
		}
		else {
			System.out.println("여행 가자");
		}
*/
	}

}
