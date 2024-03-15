import java.util.*;
public class HAQ5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of the square matrix : ");
		int n=sc.nextInt();		
		int[][] arr=new int[n][n];
		int maxcount=0, maxcountc=0,maxr=0,maxc=0;		
		for(int i=0;i<n;i++) {	
			int count=0,count1=0;						
			for(int j=0;j<n;j++) {
				double r=Math.random();
				if (r>=0.5)arr[i][j]=1;
				else   arr[i][j]=0;	
				if(arr[i][j]==1)count ++;
				if(arr[j][i]==1)count1 ++;
			}
			if (count>maxcount) {
				maxr=i;
				maxcount=count;
			}
			if (count1>maxcountc) {
				maxc=i;
				maxcountc=count1;
			}
		}	
		for(int[] x:arr) {
			for(int y:x) {	
				System.out.print(y+" ");
			}
		System.out.println();
		}	
		System.out.println("The largest row index : " +(maxr+1));
		System.out.println("The largest column index : "+(maxc+1));
	}
}
