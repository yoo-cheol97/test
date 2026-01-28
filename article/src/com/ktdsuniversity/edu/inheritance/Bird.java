package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal { // Animal를 확장한다 (상속)
	
	private boolean isFly;
	private float walkingSpeed;
	
	
	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}
	
	public boolean getIsFly() {
		return this.isFly;
	}
	
	public void fly() {
		this.isFly = true;
		//super.Speed(70); // 에러가 나는 이유는 animal클래스에 speed가 private라 에러가 남
		super.setSpeed(70f);
	}
	
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingSpeed); // 위에서 speed값을 바꿨기 때문에 원래 속도를 보관할 변수가 하나 필요
	}
	
	// Bird 클래서의 최종 Super Class인 클래스의 toString() 메소드를 다시 정의한다
	
	@Override
	public String toString() {
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
	
	
}
