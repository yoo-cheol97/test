package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class RefundableDrinkVendingMachineUseOverride extends DrinkVendingMachine {

	public RefundableDrinkVendingMachineUseOverride(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		super(drink1, drink2, drink3, drink4);
	}
	
	@Override
	public int pressDrinkButton(int drinkNumber, int pressCount, int inputMoney) {
		int orderPrice = super.pressDrinkButton(drinkNumber, pressCount, inputMoney);
		
		if (super.getInputMoney() > 0) {
			this.refund();
		}
		return orderPrice;
	}

	/**
	 * 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을 때, 사용자에게 돈을 돌려준다. 
	 * DrinkVendingMachine의 멤버변수와 order 기능의 수정이 필요.
	 */
	public void refund() {
		int remainMoney = super.getInputMoney();
		System.out.println(remainMoney + "원 환불 되었습니다.");
	}

}