import java.util.*;
public class Main {
	public static void String_to_Integer(String str,int ans){
		if(str.length() == 0){
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		int digit = (int) ch - 48;
		String_to_Integer(str.substring(1),ans+(digit*((int)Math.pow(10,str.length()-1))));
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans =0;
		int index = 0;
		String_to_Integer(str,ans);
    }
}
// https://hack.codingblocks.com/app/contests/3553/1373/problem
