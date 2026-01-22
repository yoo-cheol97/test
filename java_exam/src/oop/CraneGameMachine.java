package oop;

import java.util.Random;

public class CraneGameMachine {
	
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
		}
		else{
			isInsertCoin = false;
		}
	}
	public int doGame() {
		if(isInsertCoin = true) {
			Random random = new Random();
			int result = random.nextInt(2);
			dolls -= result;
			isInsertCoin = false;
			return result;
		}
		else {
			return 0;
		}
	}

}
