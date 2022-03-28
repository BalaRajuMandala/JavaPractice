package LeetCode;

public class NonDecreasingArray {
	public static void main(String args[]) {
		System.out.println("values " + checkPossibility());
	}

	public static boolean checkPossibility() {
		int[] nums = { 3, 6, 2 };
		boolean result = true;
		int swapcounter = 0;
		for (int indx = 0; indx < (nums.length - 1); indx++) {
			if (nums[indx] > nums[indx + 1]) {
				swapcounter++;
				int temp = nums[indx];
				nums[indx] = nums[indx + 1];
				nums[indx + 1] = temp;
			}
		}
		if (swapcounter >= 2) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}
