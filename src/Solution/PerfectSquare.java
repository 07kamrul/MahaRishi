package Solution;

public class PerfectSquare {

	public static void main(String[] args) {

		int[] myNum = {6, 9, 36, 49, 0, 1, -5, 0};
		
		for (int number : myNum) {
			if(checkPerfectSquare(number))
			{
				System.out.println("\nYes, "+number+ " the given number is perfect square.");  
			}
			else
			{
				System.out.print("\nNo, "+number+" the given number is not perfect square.");   
			}	
		}
		
	}
	
	public static boolean checkPerfectSquare(double number) {
		for(int i = 1; i*i <= number; i++) {
			if((number % i == 0) && (number / i == i))
			{
				return true;
			}
		}
		return false;
	}
}
