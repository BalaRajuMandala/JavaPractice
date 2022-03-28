/**
 * 
 */

/**
 * @author bala.raju.mandala
 *
 */
public class ElectronicsShop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int budget = 30;
		int[] keyboards = {40,50,60};
		int[] usb = {5,8,12};
		int maxSpend = -1;
		
		for (int kbPrice: keyboards ) {
			for (int ubsPrice : usb) {
				int tempSum = kbPrice +  ubsPrice;
				if (tempSum <= budget && tempSum > maxSpend ) {
					maxSpend = tempSum;
				}
			}
		}
		
		System.out.println("Max spend " + maxSpend);
	}
}
