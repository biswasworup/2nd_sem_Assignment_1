import java.util.*;
public class Q9 {
	public static double sumofmajordiagonal(double[][]arr) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows/columns of the square matrix : ");
		int n=sc.nextInt();
		double[][] arr=new double[n][n];
		for(int i=0;i<n;i++) {
			System.out.println("enter elements of row "+i);
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
		System.out.println("entered elements of the square matrix are : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)System.err.print(" "+arr[i][j]+" ");
				else	System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of the major diagonal is : "+sumofmajordiagonal(arr));
	}
	
}
