package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame() {
		this.keyboard = new Scanner(System.in);
	}
	
	
	public void startGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요");
		this.startWord = this.keyboard.nextLine(); // 시작 단어를 입력한다
		
		String lastLetter = "";
		String firstLetter = "";
		
		while(true) { // 언제 끝날지 모르니 무한 반복
			
			System.out.println("다음 단어를 입력해주세요");
			this.nextWord = this.keyboard.nextLine(); // 다음 단어를 입력한다
			this.nextWord = this.nextWord.trim(); // 다음 단어에서 좌우 공백 삭제, 제거된 결과를 할당시킨다
			
			// 시작 단어의 마지막 글자 추출 배열 생각 0 1 2(기 찻 길), .lenght() - 1로 마지막 글자 가져오기
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";// ""붙이면 문자열
			
			firstLetter = this.nextWord.substring(0, 1); // 다음 단어의 첫 번째 글자 추출 (0번부터 1번 전까지)
			
			if(lastLetter.equals(firstLetter)) { //시작 단어의 마지막 글자와 다음 단어의 첫 글자가 같은지 비교
				
				if(this.nextWord.length() >= 3) { // 단어가 3글자 이상인가
					this.startWord = this.nextWord;
				}
				else {
					System.out.println("게임이 종료됐습니다");
					break; //게임이 종료되면 반복이 끝나야함
				}
				
			}
			else {
				System.out.println("게임이 종료됐습니다");
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		RelayGame game = new RelayGame();
		game.startGame();
		
	}

}
