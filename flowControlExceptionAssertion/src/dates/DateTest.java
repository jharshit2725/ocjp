package dates;

import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d.toString());
	System.out.println(d.getTime());
	
	Date d1=new Date(1000000000000l);
	System.out.println(d1.toString());
	
	d1.setTime(d1.getTime()+3600000);
	System.out.println(d1.toString());
	
}
}
