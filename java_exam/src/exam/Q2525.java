package exam;

public class Q2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 23;
		int m = 48;
		
		int cooktime = 25;
		
		if(cooktime >= 1440) {
			int days = cooktime / 1440;
			cooktime -= 1440 * days;
		}
		
		int minutes = h * 60 + m;
		minutes += cooktime;
		if (minutes > 24 * 60) {
			minutes -= 24 * 60;
		}
		
		int endH = minutes / 60;
		int endM = minutes % 60;
		
		System.out.println(endH + " " + endM);
		
		
	}

}
