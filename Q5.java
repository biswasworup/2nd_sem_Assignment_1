import java.util.*;
public class Q5 {
	public static int sum_Of_Digits(int n) {
		if (n<0)n=-n;
		int sum=0;
		while(n>0) {
			sum +=n%10;
			n /=10;
		}
        return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to get sum till a single digit : ");
		int n=sc.nextInt();
		int sum=sum_Of_Digits(n);
		if (sum>9)sum=sum_Of_Digits(sum);
		System.out.println("Sum of digits of "+n+" until the number is a single digit is : "+sum);
}
}