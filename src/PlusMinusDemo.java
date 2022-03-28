import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PlusMinusDemo {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus() {
    // Write your code here
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	arr.add(-4);arr.add(3);arr.add(-9);arr.add(0);arr.add(4);arr.add(1);    	
    			
    	int positives = 0;
    	int negatives = 0;
    	int zeros = 0;
    	
    	for(int index : arr) {
    		if (index == 0) {
    			zeros++;
    		} else if (index < 0) {
    			negatives++;
    		} else if (index > 0) {
    			positives++;
    		}    			
    	}
    	
    	System.out.println(positives + " " + negatives + " " + zeros + " " + arr.size());
    	DecimalFormat df = new DecimalFormat();
    	df.setMaximumFractionDigits(6);
    	
    	
    	float sixdecimals = (float) positives/arr.size();
    	System.out.println(df.format(sixdecimals));
    	
    	sixdecimals = (float)  negatives/arr.size();
    	System.out.println(df.format(sixdecimals));
    	
    	sixdecimals = (float) zeros/arr.size();
    	System.out.println(df.format(sixdecimals));
    }
    
    public static void main(String[] args) {
    	plusMinus();
    }

}

//public class PlusMinusDemo {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        Result.plusMinus(arr);
//
//        bufferedReader.close();
//    }
//}
