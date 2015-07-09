package list;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DvdInfo {
	String title;
	String genre;
	String singer;

	public DvdInfo(String t, String g, String s) {
		title=t;
		genre=g;
		singer=s;
	}

	public static void popolateList(){
		char in[]=new char[50];
		File file=new File("dvdinfo.txt");
		List<DvdInfo> ls=new ArrayList<DvdInfo>();
		try {		
			FileReader fr=new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s1=null;
			while((s1=br.readLine())!=null){
				System.out.println(s1);
				String[] inf=s1.split("/");
				ls.add(new DvdInfo(inf[0], inf[1], inf[2]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(ls);

	}
	public static void main(String[] args) {
		DvdInfo.popolateList();
	}

}
