package exam;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner keyboard = new Scanner(System.in);
		
		int i = 1;
		int j = 1;
		
		//i = keyboard.nextInt();
		
		while ( i < 6 ) {
			j = 1;
			while ( j <= i ) {
				
				System.out.print("*");
				j++;
				
			}
			System.out.println(""); // 한 줄 띄기
			
			i++;
			
		}
		
		
		/*int n = 2;
		int o = 1;
		
		while (n < 10) {
			
			i = 1;
			while( o < 10) {
				
				System.out.println(n + "*" + o + "=" + n * o);
				o++;
			}
			
			n++;
		}*/

	}

}
