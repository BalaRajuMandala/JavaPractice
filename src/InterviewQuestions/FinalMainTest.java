package InterviewQuestions;

public class FinalMainTest {
//	public final static void main(String[] args) throws Exception {
	public static void main(String[] args) throws Exception {
		System.out.println("This is Test Class");
	}
}

class Child extends FinalMainTest {
	public static void main(String[] args) throws Exception {
		System.out.println("This is Child Class");
	}
}