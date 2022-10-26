import java.util.*;
public class Main {
	static int count = 0;
	public static void Subset_problem(int[] arr, int i, String ans, int sum, int target){
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				count++;

			}
			return;
		}

		Subset_problem(arr, i + 1, ans + arr[i] + " ", sum + arr[i], target);
		Subset_problem(arr, i + 1, ans, sum, target);
    }
 
    // If no remaining elements,
    
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Vector<Integer> v= new Vector<Integer>();
		Subset_problem(arr, 0, "", 0, target);
		System.out.println();
		System.out.println(count);

    }
}
// https://hack.codingblocks.com/app/contests/3553/131/problem
