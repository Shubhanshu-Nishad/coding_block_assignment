import java.util.*;
public class Main {
    static String finalString;
	static boolean isFinalFound;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();

		char[] ca = inp.toCharArray();
		Arrays.sort(ca);
		String str = new String(ca);

		isFinalFound = false;
		finalString = inp;

		printPermutation(str, "");
	}

	public static void printPermutation(String str, String res) {
		if (isFinalFound)
			return;

		if(str.equals("")) {
			if (res.equals(finalString)) {
				isFinalFound = true;
				return;
			}
			System.out.println(res);
			return;
		}

		for (int i = 0; i < str.length(); i ++)
			printPermutation(str.substring(0, i) + str.substring(i).substring(1), res + str.charAt(i));
	}
}

// https://hack.codingblocks.com/app/contests/3553/1063/problem
