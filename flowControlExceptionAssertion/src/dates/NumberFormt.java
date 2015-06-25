package dates;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormt {
	
	public static void main(String[] args) {	
		Locale l=new Locale("fr");
		NumberFormat nf=NumberFormat.getCurrencyInstance(l);
		NumberFormat nfUS=NumberFormat.getCurrencyInstance();
		float f=123.456f;
		System.out.println(nf.format(f));
		
		System.out.println(nfUS.format(f));
	}
}
