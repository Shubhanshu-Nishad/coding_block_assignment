import java.util.*;
public class Main {
	public static void odd_even_series(int n){
		if(n==0)
			return;
		if(n%2==0){
			odd_even_series(n-1);
			System.out.println(n);
		}
		else{
			System.out.println(n);
			odd_even_series(n-1);
		}
			
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		odd_even_series(n);
    }
}


// https://hack.codingblocks.com/app/contests/3553/142/problem
