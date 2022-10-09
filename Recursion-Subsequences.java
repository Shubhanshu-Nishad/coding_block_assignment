import java.util.*;
public class Main {
	static int count = 0;
	public static void Recursion_Subsequences(String str,String ans){
		if(str.length() == 0){
			count++;
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);
		Recursion_Subsequences(str.substring(1),ans);
		Recursion_Subsequences(str.substring(1),ans+ch);
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		Recursion_Subsequences(str,ans);
		System.out.println("\n" +count);
    }
}
// https://online.codingblocks.com/app/player/253175/content/249309/14701/lecture
