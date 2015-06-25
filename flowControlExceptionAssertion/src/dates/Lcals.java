package dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Lcals {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	Date date=calendar.getTime();
	Locale locale=new Locale("it", "IT");
	
	DateFormat dfUS=DateFormat.getInstance();
	System.out.println("US    "+dfUS.format(date));
	
	DateFormat dfIT=DateFormat.getDateInstance(DateFormat.FULL, locale);
	System.out.println("ITALY     "+dfIT.format(date));
	System.out.println(locale.getDisplayCountry()+" "+locale.getDisplayLanguage());
}
}
