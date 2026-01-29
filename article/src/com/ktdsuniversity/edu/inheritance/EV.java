package com.ktdsuniversity.edu.inheritance;

public class EV extends Vehicle {

	private int batteryAmount;

	public EV(String modelName, int batteryAmount) {
		super(modelName, "위이잉");
		this.batteryAmount = batteryAmount;
	}

	public void printBatteryAmount() {
		if (super.getIsStart()) {
			String modelName = super.getModelName();
			System.out.println(modelName + " 배터리 잔량은 " + this.batteryAmount + "입니다.");
		}
	}
}
