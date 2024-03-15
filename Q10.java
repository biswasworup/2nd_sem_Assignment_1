import java.util.*;
public class Q10 {
	public static double sum(double[][] arr,int column) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i][column];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows : ");
		int n=sc.nextInt();
		System.out.print("enter no. of columns : ");
		int m=sc.nextInt();
		double[][] arr=new double[n][m];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter elements of row "+i+" : ");
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}System.out.println("entered elements of arry are : ");
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr.length;j++) {
				System.out.print(" "+arr[i][j]+" ");
			}System.out.println();
		}
		
		for (int i=0;i<m;i++) {
			System.out.println("sum of elements of coulmn "+i+" "+sum(arr,i));
		}
	}
	

}
