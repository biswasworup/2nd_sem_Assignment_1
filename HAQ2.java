import java.util.*;
public class HAQ2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many lines do you want to enter : ");
		int n=sc.nextInt();
		String[] arr=new String[n+1];
		for(int i=0;i<n+1;i++) {			
			System.out.println("enter "+(i)+"line : ");
			arr[n-i]=sc.nextLine();
		}
		for(int i=0;i<n+1;i++)
			System.out.println(arr[i]);
	}

}
