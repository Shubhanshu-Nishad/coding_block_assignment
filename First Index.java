import java.util.*;
public class Main {
	public static int First_Index(int starting_index,int[] arr,int target){

		
		if(starting_index==arr.length){
			return -1;
		}
		if(arr[starting_index]==target){
			return starting_index;
		}
		return First_Index(starting_index+1,arr,target);
		
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
		System.out.println(First_Index(0,arr,target));
    }
}


// https://hack.codingblocks.com/app/contests/3553/526/problem
