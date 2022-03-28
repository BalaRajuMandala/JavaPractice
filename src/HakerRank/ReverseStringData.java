package HakerRank;

public class ReverseStringData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringData();
	}

	private static void ReverseStringData() {
		// TODO Auto-generated method stub
		String encryptedMessage = "seaside the to sent be to ne2ds army ten of team a";
		StringBuilder strdata = new StringBuilder();

		String[] encryptedMessagearr = encryptedMessage.split(" ");

		for (int indx = 0; indx < encryptedMessagearr.length; indx++) {
			String data = encryptedMessagearr[indx];
			char[] charArray = data.toCharArray();

			for (int idx = 0; idx < charArray.length; idx++) {
				if (Character.isDigit(charArray[idx])) {
					int num = Character.getNumericValue(charArray[idx]);
					System.out.println(num);
					for (int local = 0; local < num; local++) {
						strdata.append(charArray[idx - 1]);
					}
				} else {
					strdata.append(charArray[idx]);
				}

			}
			strdata.append(" ");
		}

		String decypher = strdata.toString();
		System.out.println("decypher " + decypher);

		String[] strarr = decypher.split(" ");

		StringBuilder finaldata = new StringBuilder();
		System.out.println(strarr.length);
		for (int indx = strarr.length - 1; indx >= 0; indx--) {

			finaldata.append(strarr[indx]);
			finaldata.append(" ");
		}

		final String data = finaldata.toString();
		System.out.println(data);

	}

}
