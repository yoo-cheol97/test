package com.ktdsuniversity.edu.file;

import java.io.File;

public class Recursive {
	
	public void deleteDirectory(File target) {
		
		if(target.isFile()) {
			System.out.println(target.getAbsolutePath());
			target.delete();
		}
		else if(target.isDirectory()) { // 폴더 내부의 목록을 조회
			File[] children = target.listFiles();
			for(File child: children) {
				//System.out.println(child.getAbsolutePath());
				this.deleteDirectory(child);
				
			}
			
			System.out.println(target.getAbsolutePath());
			target.delete();
		}
		
	}
	
	
	public void printFiles(File target) {
		
		if(target.isFile()) {
			System.out.println(target.getAbsolutePath());
		}
		else if(target.isDirectory()) { // 폴더 내부의 목록을 조회
			File[] children = target.listFiles();
			for(File child: children) {
				//System.out.println(child.getAbsolutePath());
				this.printFiles(child);
				
			}
		}
		
	}
	
	
	public void printNumber(int number) {
		System.out.println(number);

		if(number > 0) {
			printNumber(number - 1);
		
		}
		
	}
	
	public int sumToZero(int start) {
		
		// start ==> 5
		//>> start ==> 1
		if(start == 1) {
			return 1;
		}
		
		return start + sumToZero(start - 1);
		
	}
	
	
	public void print(int number) {
		System.out.println("출력합니다" + number);
		if(number < 3) {
			print(number + 1);
			System.out.println(number + " 스택 실행을 완료 했습니다");
		}
	}

	public static void main(String[] args) {
		Recursive r = new Recursive();
		//r.print(1);
		//r.printNumber(2000);
		//int result = r.sumToZero(5);
		//System.out.println(result);
		
		//File root = new File("C:/DevPrograms");
		//r.printFiles(root);
		
		File root = new File("C:/Users/User/Documents/삭제대상");
		r.deleteDirectory(root);
	}
	
}
