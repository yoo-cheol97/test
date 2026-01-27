package exam;

public class Q2562 {
	
	public static void main(String[] args) {
		
		int[] numArray = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int max = 0;
		int maxNum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > max) {
				max = numArray[i];
				maxNum = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxNum);
	}

}
