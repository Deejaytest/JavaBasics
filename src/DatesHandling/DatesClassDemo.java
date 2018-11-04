package DatesHandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesClassDemo {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.toString());
		
		SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = d2.format(d1);
		System.out.println("Date in dd/MM/yyyy is " +strDate);
		
		d2 = new SimpleDateFormat("MM/dd/yyyy");
		String strDate1 = d2.format(d1);
		System.out.println("Date in MM/dd/yyyy is " +strDate1);
		
		d2 = new SimpleDateFormat("MM-dd-yyyy");
		String strDate2 = d2.format(d1);
		System.out.println("Date in MM-dd-yyyy is " +strDate2);
		
		d2 = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss ");
		String strDate3 = d2.format(d1);
		System.out.println("Date in MM-dd-yyyy and hours/mins/sec (hours 1-12)is " +strDate3);
		
		d2 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss ");
		String strDate4 = d2.format(d1);
		System.out.println("Date in MM-dd-yyyy and hours/mins/sec (hours 1-24)is " +strDate4);
		
		
		
		
	}

}
