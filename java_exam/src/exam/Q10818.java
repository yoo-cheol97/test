package exam;

public class Q10818 {

	public static void main(String[] args) {
		
		int[] num = {20, 10, 35, 30, 7};
		
		/*
		int temp = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			for(int j =  i + 1; j < numArray.length; j++) {
				if(numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		System.out.println(numArray[0] +" "+ numArray[4]);
*/
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(min + " " + max);
	}


}
