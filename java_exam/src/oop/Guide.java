package oop;
/**
 * <pre>
 * 식당의 가이드 (안내원)
 * n명의 손님이 입장이 가능한지 아닌지 안내하는 역할
 * </pre>
 */

public class Guide {
	
	
	/**
	 * 식당의 총 좌석 수
	 */
	int tableCount;
	/**
	 * 이용 중인 좌석 수
	 */
	int customerCount;
	/**
	 * 대기 중인 손님 수
	 */
	int waitingCount;
	/**
	 * 매출금
	 */
	int amount;
	/**
	 * 빈 좌석의 수
	 * @return
	 */
	/**
	 * 손님 입장 시키기
	 * @return visiterCount 입장하려는 손님의 수
	 */
	public int getUnuseableTableCount() {
		return tableCount - customerCount;
	}
	
	public void enterCustomers(int visitorCount) {
		
		int unuseableTableCount = getUnuseableTableCount();
		System.out.println("남은 좌석 수: " + unuseableTableCount + "개");
		System.out.println("입장 고객 수: " + visitorCount + "명");
		System.out.println("대기 고객 수: " + waitingCount + "명");
		
		if(unuseableTableCount >= visitorCount && waitingCount == 0) {
			System.out.println(visitorCount + "명 입장하세요");
			customerCount += visitorCount;
			if(waitingCount > visitorCount) {
				waitingCount -= visitorCount;
			}
		}
		else {
			System.out.println("자리가 부족해 잠시 기다려주세요");
			System.out.println("앞에 " + waitingCount + "명 대기 중 입니다");
			waitCustomer(visitorCount);
		}
		System.out.println();
	}
	/**
	 * 손님 대기 시키기
	 * @param visitorCount 대기하려는 손님의 수
	 */
	
	public void waitCustomer(int visitorCount) {
		waitingCount += visitorCount;
		
	}
	/**
	 * 결제하기
	 * @param visitorCount 이용을 종료하는 손님의 수
	 * @param money 손님이 지불할 비용
	 */
	
	public void getMoney(int visitorCount, int money) {
		customerCount -= visitorCount;
		amount += money;
		
		System.out.println(visitorCount + "명 계산합니다.");
		System.out.println("이용 금액 " + money + "원 입니다.");
		System.out.println("이용 중인 고객 수: " + customerCount + "명");
		System.out.println("매출액 : " + amount + "원");
		System.out.println();
	}
	
	
	//현재 빈 좌석이 몇 개 있는지 확인하기
	//   식당의 총 좌석 수, 이용 중인 좌석의 수
	//손님 입장 시키기
	//   이용 중인 좌석의 수 변화
	//   대기 중인 손님의 수 변화
	//손님 대기 시키기
	//   대기 중인 손님의 수 변화
	//결제하기
	//   이용 중인 좌석의 수 변화
	//   이용 요금 계산 ==> 식당의 매출금 변화
	
	
	
	
	
	
}
