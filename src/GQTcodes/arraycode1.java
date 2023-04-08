package GQTcodes;
import java.util.Scanner;

public class arraycode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.println("enter the marks of the student no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("##########---------Marksadded-------#########");
		for(int i=0;i<=n-1;i++) {
			System.out.println("the marks of student no:"+(i+1)+" is="+arr[i]);
		}
	}
}
