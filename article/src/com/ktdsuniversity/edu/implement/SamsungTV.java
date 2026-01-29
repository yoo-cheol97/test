package com.ktdsuniversity.edu.implement;

/**
 * Before 구조 변경
 * TV
 * SamsungSmartTV
 *        SamsungTV ( TV + SamsungSmartTV )
 * LgSmartTV
 *        LgTV ( TV + LgSmartTV)
 *------------------------------------------ * 
 * After
 * TV
 *    SamsungSmartTV
 *              SamsungTV
 *    LgSmartTV
 *              LgTv
 */

public class SamsungTV implements SamsungSmartTV {

	@Override
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("삼성 티비를 끕니다");
		
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("삼성 티비의 채널을 바꿉니다: " + channelNumber);
		
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("삼성 티비의 볼륨을 바꿉니다: " + volume);
		
	}

	@Override
	public void runNetflix() {
		System.out.println("삼성 티비의 넷플릭스를 실행합니다");
		
	}

	@Override
	public void runMenu() {
		System.out.println("삼성 티비의 메뉴 실행합니다");
		
	}

	@Override
	public void runCoupangplay() {
		System.out.println("삼성 티비의 쿠팡플레이를 실행합니다");
		
	}
	

}
