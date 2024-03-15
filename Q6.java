import java.util.*;
public class Q6 {
	public static boolean isOdd(int n) {
		int rest = 0;
		while(n>2) {
			rest=n-2;
			n -=2;
		}
        if (rest==1)return true;
        else return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check odd : ");
		int n=sc.nextInt();
		if(n<0)n=-n;
		if(isOdd(n)==true)System.out.println("entered number is odd");
		else System.out.println("entered number is even");
	}		
}
