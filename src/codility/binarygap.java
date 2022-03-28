package codility;

import java.util.ArrayList;

public class binarygap {

	public static void main(String args[]) {
		// write your code in Java SE 8
		// boolean flag = true;
		int N=1041;
		int indx = 0;
		ArrayList arr = new ArrayList();
		
		while (N > 0) {
			arr.add(indx++, N%2);			
			N = N / 2;
			System.out.println(N);
		}

		int binarygaplength = 0;

		int highestbinlen = 0;
		
		System.out.println("Binary format - ");
		arr.forEach(System.out::print);
		System.out.println();
		
		for (int lndx = 0; lndx < arr.size(); lndx++) {
			int data = (int) arr.get(lndx);
			if (data == 1) {
				for (int kndx = lndx + 1; kndx < arr.size(); kndx++) {
					int indata = (int) arr.get(kndx);
					if (indata == 0) {
						binarygaplength++;
					} else if (indata == 1) {
						if (highestbinlen <= binarygaplength) {
							highestbinlen = binarygaplength;
						}
						binarygaplength = 0;
					}
				}
			}
		}

		System.out.println(highestbinlen);
	}

}
