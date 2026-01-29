package com.ktdsuniversity.edu.implement;

public class Test {
	
	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
		LgRemoteController LgRemoteCon = new LgSmartRemoteController();
		LgRemoteCon.turnOn(lgTV);
		LgRemoteCon.runYoutube(lgTV);
		
		
		/*lgTV.turnOn();
		lgTV.runNetflix();
		lgTV.turnOff();*/
	
		SamsungSmartTV samsungTV = new SamsungTV();
		LgRemoteCon.turnOn(samsungTV); // 다형성 때문에 TV가 켜진다 (IS A 때문)
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangplay(samsungTV);
		
		DaisoRemoteController rc = new DaisoRemoteController();
		rc.turnOff(samsungTV);
		
		
		
		/*samsungTV.turnOn();
		samsungTV.runNetflix();
		samsungTV.changeVolume(50);
		samsungTV.turnOff();*/
		
	}

}
