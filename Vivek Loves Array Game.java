import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			long tSum = 0;
			for (int i = 0; i < n; i ++) {
				arr[i] = sc.nextInt();
				tSum += arr[i];
			}
			if (tSum == 0)
				System.out.println(n - 1);
			else
				System.out.println(maxScore(arr, 0, n, tSum));
		}
	}

	private static long maxScore(int[] arr, int l, int h, long tSum) {
		long left = 0, right = tSum;

		for (int i = l; i < h; i ++) {
			left += arr[i];
			right -= arr[i];

			if (left == right)
				return 1 + Math.max(maxScore(arr, l, i + 1, left), maxScore(arr, i + 1, h, right));
		}

		return 0;
	}
}
//https://hack.codingblocks.com/app/contests/3553/703/problem
