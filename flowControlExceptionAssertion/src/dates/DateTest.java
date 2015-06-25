package dates;

import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println("current date: "+d.toString());
	System.out.println("mili seconds after 1970: "+d.getTime());
	
	Date d1=new Date(1000000000000l);
	System.out.println("time after adding above seconds to: "+d1.toString());
	
	d1.setTime(d1.getTime()+3600000);
	System.out.println("After adding some more secnds: "+d1.toString());
	
}
}
