package oop;

public class CraneGameMachineTest {

	public static void main(String[]args) {
		
		CraneGameMachine craneGame = new CraneGameMachine();
		
		craneGame.isInsertCoin = false;
		craneGame.dolls = 30;
		craneGame.insertCoin();
		int result = craneGame.doGame();
		
		
		System.out.println("뽑은 인형: " + result);
		System.out.println("남은 인형: " + craneGame.dolls);

		
	}
}
