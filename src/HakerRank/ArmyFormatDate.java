/**
 * 
 */
package HakerRank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bala.raju.mandala
 *
 */
public class ArmyFormatDate {

	/**
	 * 
	 */
	public ArmyFormatDate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    String output = null;
        try {
        	String s = "07:05:45PM";
        	SimpleDateFormat twlvhour = new SimpleDateFormat("hh:mm:ssaa");
        	SimpleDateFormat armyhour = new SimpleDateFormat("HH:mm:ss");
            Date temp1 = twlvhour.parse(s);
            System.out.println(temp1);
            String temp2 = armyhour.format(temp1);
            System.out.println(temp2);            
        } catch(Exception ex) {
            
        }            

	}

}
