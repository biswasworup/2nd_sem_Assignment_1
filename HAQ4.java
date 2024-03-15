import java.util.*;
public class HAQ4 {
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] arr=new double[a.length][a[0].length];
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr[0].length;j++)
				arr[i][j]=a[i][j]+b[i][j];
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of rows of the arry : ");
		int r=sc.nextInt();
		System.out.println("enter no. of columns of the arry : ");
		int c=sc.nextInt();
		double[][] arr=new double[r][c];
		double[][] arr1=new double[r][c];
		for(int i=0;i<r;i++) {
			System.out.println("enter elemrnts of 1st arry of row "+(i+1));
			for(int j=0;j<c;j++)
				arr[i][j]=sc.nextDouble();
		}
		for(int i=0;i<r;i++) {
			System.out.println("enter elemrnts of 2nd arry of row "+(i+1));
			for(int j=0;j<c;j++)
				arr1[i][j]=sc.nextDouble();
		}
		System.out.println("additio of two matrices is : ");
		double[][] arr2=new double[r][c];
		arr2=addMatrix(arr,arr1);
		for(int i=0;i<r;i++) {			
			for(int j=0;j<c;j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
	}
	

}
