import java.util.*;
public class Main {
   static boolean startPrinting;
	static String isInputStringFound;


	public static void main(String[] args) {
		startPrinting = false;

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		isInputStringFound = str;

		char[] strA = str.toCharArray();
		Arrays.sort(strA);
		String smallestString = new String(strA);

		printPermutations(smallestString, "");
	}

	public static void printPermutations(String str, String res) {
		if (str.equals("") && startPrinting) {
			System.out.println(res);
			return;
		}

		if (res.equals(isInputStringFound))
			startPrinting = true;

		for (int i = 0; i < str.length(); i ++)
			printPermutations(str.substring(0, i) + str.substring(i).substring(1), res + str.charAt(i));
	}
}
// https://hack.codingblocks.com/app/contests/3553/394/problem
