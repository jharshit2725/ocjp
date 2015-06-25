package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormates {
	public static void main(String[] args) {
		Date d1=new Date(10000000l);

		DateFormat[] dfa=new DateFormat[3];
		dfa[0]=DateFormat.getInstance();
		dfa[1]=DateFormat.getDateInstance();
		dfa[2]=DateFormat.getDateInstance(DateFormat.SHORT);

		for(DateFormat d:dfa){
			String s=d.format(d1);
			System.out.println(s);
			try{
				Date d2=d.parse(s);
				System.out.println(d2.toString());
			}catch(ParseException e){
			}
		}


	}
}
