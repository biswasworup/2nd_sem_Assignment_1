import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows : ");
		int r=sc.nextInt();
		System.out.println("enter the no. of columns : ");
		int c=sc.nextInt();
		double[][] arr=new double[r][c];
		for(int i=0;i<r;i++) {
			System.out.println("enter elements of "+i+" row");
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextDouble();
				}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(" "+arr[i][j]+" ");
				}
			System.out.println();
		}
		double sum=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum +=arr[i][j];
				}
		}
		System.out.println("sum of the matrix is : "+sum);
	}
}
