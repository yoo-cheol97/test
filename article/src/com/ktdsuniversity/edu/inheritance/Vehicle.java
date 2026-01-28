package com.ktdsuniversity.edu.inheritance;

public class Vehicle {

	private String modelName;
	private boolean isStart;
	
	public Vehicle(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public boolean getIsStart() {
		return this.isStart;
	}
	
	public void startEngine() {
		this.isStart = !isStart;
		if (this.isStart) {
			System.out.println(this.modelName + " 시동을 걸었습니다.");
		}
		else {
			System.out.println(this.modelName + " 시동을 껏습니다.");
		}
	}
}
