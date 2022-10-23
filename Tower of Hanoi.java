import java.util.*;
public class Main {
	public static void Tower_of_Hanoi(int n,String src,String helper,String des){
		if(n==0){
			return;
		}
		Tower_of_Hanoi(n-1,src,des,helper);
		System.out.println("Moving ring "+n+" from "+ src +" to "+des);
		Tower_of_Hanoi(n-1,helper,src,des);
	}
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Tower_of_Hanoi(n,"A","C","B");
    }
}

// Moving ring 1 from A to B
// Moving ring 1 from A to C

// https://hack.codingblocks.com/app/contests/3553/1080/problem
