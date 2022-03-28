
public class MagicSquare {

	static void calculator() {
		int[][] s = {{4,8,6},{2,5,7},{9,1,3}};
		
		int cost = 0;
		
		if (s[2][2] != 5 ) {
			cost = cost + Math.abs(5-s[1][1]);
			s[1][1] = 5;
		}
		
		for (int[] p : s) {
			for (int num : p) {
				if (num == 5 ) {
					
				}
			}
		}
	}
	
	public static void main(String args[]) {
		calculator();
	}
}
