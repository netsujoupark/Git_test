package pakkk;
//divide data
import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st =new StringTokenizer("Mike,010-1111-2222,mk66@mail.com",",");
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}