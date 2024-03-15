import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter weight of the person in kg : ");
		double w=sc.nextDouble();
		System.out.print("enter height of the person in meter : ");
		double h=sc.nextDouble();
		double BMI=w/(h*h);
		if (BMI<=18.5)System.out.println("the person is under weight");
		else if (18.5<BMI && BMI<=24.9)System.out.println("the person is normal weight");
		else if (25<=BMI && BMI<=29.9)System.out.println("the person is over weight");
		else System.out.println("the person is obese");
	}

}
