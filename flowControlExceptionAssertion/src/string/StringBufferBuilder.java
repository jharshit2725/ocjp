package string;

public class StringBufferBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        sb.reverse().insert(4, "Sansa");
        sb.append(new StringBufferBuilder());        
        System.out.println(sb);
        
        
        StringBuffer sbuf = new StringBuffer("hash");
        sbuf.append(true);
        sbuf.insert(7, "Hi").delete(8, 9);
        System.out.println(sbuf);
        
	}
}
