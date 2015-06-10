package garbagecollection;

import java.util.Date;

public class CheckGC {
	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		System.out.println("total memory"+rt.totalMemory());

		System.out.println("free memory"+rt.freeMemory());

		Date date;
		for(int i=0;i<10000;i++){
			date = new Date();
			date = null;
		}
		System.out.println("free memory"+rt.freeMemory());
        System.gc();
        System.out.println("free memory"+rt.freeMemory());
	}


}
