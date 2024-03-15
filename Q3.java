import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		int sum=0,prod=1;
		while(n>0) {
			sum +=n%10;
			prod *=n%10;
			n /=10;
		}
		if (sum==prod)System.out.println(n+" is a spy number");
		else System.out.println(n+" is not a spy number");
	}

}
