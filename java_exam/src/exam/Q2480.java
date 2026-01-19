package exam;

public class Q2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int money = 0;
		
		/*a = 3;
		b = 3;
		c = 6;*/
		
		/*a = 2;
		b = 2;
		c = 2;*/
		
		a = 6;
		b = 2;
		c = 5;
		
		if(a == b) {
			if(a == c) {
				money = 10000 + a * 1000;
				System.out.println(money);
			}
			else if( a != c) {
				money = 1000 + a * 100;
				System.out.println(money);
			}
		}
		else if (a != b) {
			if(a != c && b != c) {
				money = Math.max(a,  Math.max(c, b)) * 100;
				System.out.println(money);
			}
		}
		

	}

}
