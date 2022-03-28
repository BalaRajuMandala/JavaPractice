package InterviewQuestions;

import java.util.Scanner;

public class SingtelBracketBalancing {

	public static void main(String args[]) {
//		String input = ")((()))";
//		String input = "()";
//		String input = ")))";		
//		String input = "()(())";
//		String input = ")(()";
		String input;

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		char[] inputarr = input.toCharArray();

		int leftbracketcount = 0;
//		int rightbracketcount = 0;
		int balancebracketcount = 0;

		for (int indx = 0; indx < inputarr.length; indx++) {
			if (')' == inputarr[indx]) {
				if (leftbracketcount > 0) {
					balancebracketcount++;
					leftbracketcount--;
				}
			} else if ('(' == inputarr[indx]) {
				leftbracketcount++;
			}
		}

		System.out.println("balance count ==> " + balancebracketcount * 2);
	}

}
