import java.util.*;
public class Main {
	public static int Last_Index(int n,int[] arr,int target){

		if(n==0){
			return -1;
		}

		
		if(arr[n]==target){
			return n;
		}
		return Last_Index(n-1,arr,target);
			
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(Last_Index(n-1,arr,target));
    }
}
// https://hack.codingblocks.com/app/contests/3553/476/problem
