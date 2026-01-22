package oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car kona = new Car();
		System.out.println(kona);
		kona.pressEngineStartButton(); //kona의 시동을 건다
		kona.pressGasolinePedal(20); //speed = 30
		
		//kona의 엔진 상태를 출력한다
		boolean konaEngineStart = kona.isEngineStart;
		System.out.println("kona Engine: " + konaEngineStart);
		
		//kona의 현재 속도를 출력한다
		int konaSpeed = kona.speed;
		System.out.println("kona Speed: " + konaSpeed);
		
		Car carnival = new Car();
		System.out.println(carnival);
		
		carnival.pressGasolinePedal(200);
		carnival.pressEngineStartButton();
		carnival.pressBreakPedal(10);
		carnival.pressBreakPedal(10);

		
		boolean carnivalEngineStart = carnival.isEngineStart;
		System.out.println("carnival Engine: " + carnivalEngineStart);
		
		int carnivalSpeed = carnival.speed;
		System.out.println("carnival Speed: " + carnivalSpeed);
		
		
		
		
	}
	
	
	
}
