/**
 * 
 */
package HakerRank;

/**
 * @author bala.raju.mandala
 *
 */
public class Jumping {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		String result = "NO";

		if ((x1 > x2) && (v1 >= v2)) {
			result = "NO";
		} else if ((x2 > x1) && (v2 >= v1)) {
			result = "NO";
		} else if ((x1-x2)%(v2-v1) == 0 ) {
			result = "YES";
		}		
		
		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(Jumping.kangaroo(4523, 8092, 9419, 8076));
		//4523 8092 9419 8076
//		System.out.println(Jumping.kangaroo(0, 2, 5, 3));
		
		System.out.println(Jumping.kangaroo(43, 2, 70, 2));
	}

}
