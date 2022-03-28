/**
 * 
 */
package InterviewQuestions;

/**
 * @author bala.raju.mandala
 *
 */
public class RecursiveFactorial {

	/**
	 * 
	 */
	public RecursiveFactorial() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveFactorial obj = new RecursiveFactorial();
		
		System.out.println(obj.caliculateFactorial(4));
	}
	
	private int caliculateFactorial(int num) {
//		System.out.println(num);
		if (num == 0) {
			return 1;
		} else {
//			System.out.println("else " + num);
			return num*caliculateFactorial(--num);			
		}
		
	}

}
