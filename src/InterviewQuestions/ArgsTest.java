/**
 * 
 */
package InterviewQuestions;

/**
 * @author bala.raju.mandala
 *
 */
public class ArgsTest {
	
	public static void main(String args[]) {
		doStuff(1);
		doStuff(1,2);
	}
	
	static void doStuff(int... i) { //satisfies both methods
	}
	
//	static void doStuff(int i, int...j ) { //satisfies both methods		
//  static void doStuff(int... i, int j) { //syntax error as always the variable type should be last argument int... i

}
