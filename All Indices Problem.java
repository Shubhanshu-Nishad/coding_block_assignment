import java.util.*;
public class Main {
	public static int All_Indices_Problem(int starting_index,int[] arr,int target){

		
		if(starting_index==arr.length){
			return 0;
		}
		if(arr[starting_index]==target){
			System.out.print(starting_index+" ");
		}
		return All_Indices_Problem(starting_index+1,arr,target);
		
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
		All_Indices_Problem(0,arr,target);
    }
}

// https://hack.codingblocks.com/app/contests/3553/1374/problem
