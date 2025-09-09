package normal;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yr=2026;
		
		if(yr%4==0 | yr%400==0) {
			System.out.println("leap");
		}
		else {
			System.out.println("normal year");
		}
	}

}
