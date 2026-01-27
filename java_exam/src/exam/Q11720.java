package exam;

public class Q11720 {
	
	public static void main(String[] args) {
		
		int length = numString.length();
		int num = 0;
		int sum = 0;
		
		for (int i = 0; i < lenght; i++) {
			num = Integer.parseInt(numString.charAt(i)+"");
			sum += num;
		}
		
		
	}
	
	public void case2(String numString) {
		
		
		int length = numString.length(); // 5 ==> 10000
		int radix = 1;
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			radix *= 10;
			
		}
		
		long num = Long.parseLong(numString);
		int divResult = 0;
		
		while(true) {
			divResult = (int) (num / radix);
			sum += divResult;
			
			num -= divResult * radix;
			radix /= 10;
			
			if(radix == 0) {
				break;
			}
			System.out.println(sum);
		}
		
		
		
	}

}
