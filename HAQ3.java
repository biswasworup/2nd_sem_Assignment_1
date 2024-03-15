import java.util.*;
public class HAQ3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of the arry : ");
		int n=sc.nextInt();
		double[] arr=new double[n];
		double[] arr1=new double[n];
		System.out.println("enter elements of 1st arry : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextDouble();
		System.out.println("enter elements of 2nd arry");
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextDouble();
		double[] arr2=new double[n];
		for(int i=0;i<n;i++)
			arr2[i]=arr[i]*arr1[i];
		for(double b:arr2)
			System.out.println("dot product of the elements of the two arrys is : "+b);
	}

}
