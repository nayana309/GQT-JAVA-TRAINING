package GQTcodes;

import java.util.Scanner;

public class arraycode3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of the university:");
		int uni=sc.nextInt();
		System.out.println("Enter the count of the School:");
		int scl=sc.nextInt();
		System.out.println("Enter the count of the class:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of the Students:");
		int stu=sc.nextInt();
		int arr[][][][]=new int[uni][scl][cls][stu];
		for(int i=0;i<uni;i++) {
			System.out.println("inside university:"+(i+1));
		for(int j=0;j<scl;j++) {
			System.out.println("inside school:"+(j+1));
			for(int k=0;k<cls;k++) {
				System.out.println("inside class:"+(k+1));
				for(int l=0;l<stu;l++) {
					System.out.println("Enter marks of the student no:"+(l+1));
					arr[i][j][k][l]=sc.nextInt();
				}
		}
		}
		}
		for(int i=0;i<uni;i++) {
			System.out.println("inside university:"+(i+1));
		for(int j=0;j<scl;j++) {
			System.out.println("inside school:"+(j+1));
			for(int k=0;k<cls;k++) {
				System.out.println("inside class:"+(k+1));
				for(int l=0;l<stu;l++) {
		            System.out.println("the marks of the student no:"+(l+1)+"is:"+arr[i][j][k][l]);
				}
				
			}
	}

}
	}
}
