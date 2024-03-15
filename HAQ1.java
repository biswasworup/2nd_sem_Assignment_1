import java.util.*;
public class HAQ1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println((a+b==c)?a+"+"+b+"="+c:(b+c==a)?b+"+"+c+"="+a:(c+a==b)?c+"+"+a+"="+b:" enterd no.s donot satisfy the form a+b=c");
		System.out.println((a==b-c)?a+"="+b+"-"+c:(b==c-a)?b+"="+c+"-"+a:(c==a-b)?c+"="+a+"-"+b:"enterd no.s donot satisfy the form a=b-c");
		System.out.println((a*b==c)?a+"*"+b+"="+c:(b*c==a)?b+"*"+c+"="+a:(c*a==b)?c+"*"+a+"="+b:"enterd no.s donot stisfy the form ac=b");

	}

}
