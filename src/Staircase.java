
public class Staircase {

	static void staircase() {
		for (int outer=0; outer < 6; outer++) {
			for (int spacer=1; spacer<(6-outer); spacer++) {
				System.out.print("*");
			}
			for (int inner=0; inner<=outer; inner++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		staircase();
	}
}
