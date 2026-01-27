package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame2 {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void startGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요");
		this.startWord = this.keyboard.nextLine();
		
		String lastLetter = "";
		
		while(true) {
			System.out.println("다음 단어를 입력해주세요");
			this.nextWord = this.keyboard.nextLine();
			this.nextWord = this.nextWord.trim();
			
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
			
			if(this.nextWord.startsWith(lastLetter)) {
				
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				}
				else {
					System.out.println("게임이 종료됐습니다");
					break;
				}
				
			}
			else {
				System.out.println("게임이 종료됐습니다");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		RelayGame2 game = new RelayGame2();
		game.startGame();
		
	}

}
