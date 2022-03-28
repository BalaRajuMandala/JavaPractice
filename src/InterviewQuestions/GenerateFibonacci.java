/**
 * 
 */
package InterviewQuestions;

/**
 * @author bala.raju.mandala
 *
 */
public class GenerateFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fiboseries1 = 0;
		int fiboseries2 = 1;

		System.out.print(fiboseries1 + " ");
		System.out.print(fiboseries2 + " ");

		for (int indx = 2; indx < 10; indx++) {
			int result = fiboseries1 + fiboseries2;
			System.out.print(result + " ");

			fiboseries1 = fiboseries2;
			fiboseries2 = result;

		}

	}

}
