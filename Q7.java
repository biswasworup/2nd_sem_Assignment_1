import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length of the arry : ");
		int n=sc.nextInt();
		double[] arr=new double[n];
		System.out.println("enter elements of the arry : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextDouble();
		}
		System.out.print("entered arry is : [ ");
		for(int i=0;i<n;i++)
			if(i==n-1)System.out.print(arr[i]+" ");
			else System.out.print(arr[i]+", ");	
	         System.out.println("]");	
	         double max = arr[0];
	         double min = arr[0];
	         int maxCount = 0;
	         int minCount = 0;
	         int maxFirstOccurrence = 0;
	         int minLastOccurrence = 0;	       
	         for (int i = 0; i < n; i++) {
	             if (arr[i] > max) {
	                 max = arr[i];
	                 maxCount = 1;
	                 maxFirstOccurrence = i;
	             } else if (arr[i] == max) {
	                 maxCount++;
	             }
	             if (arr[i] < min) {
	                 min = arr[i];
	                 minCount = 1;
	                 minLastOccurrence = i;
	             } else if (arr[i] == min) {
	                 minCount++;
	                 minLastOccurrence = i;
	             }
	         }
	            System.out.println("maximum value is : "+max+" and max value occurs : "+maxCount+((max>1)?" times":" time"));
	            System.out.println("minimum value is : "+min+" and min value occurs : "+minCount+((max>1)?" times":" time"));
	            System.out.println("first occurrence of the maximumelement is at position : "+(maxFirstOccurrence+1));
//	            System.out.println("last occurance of the maximumelement is at position : "+);
//	            System.out.println("first occurance of the minimumelement is at position : "+);
	            System.out.println("last occurance of the minimumelement is at position : "+(minLastOccurrence+1));
	            
	}
}
