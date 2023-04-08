package GQTcodes;

import java.util.Scanner;

public class arraycode2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of the School:");
		int scl=sc.nextInt();
		System.out.println("Enter the count of the class:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of the Students:");
		int stu=sc.nextInt();
		int arr[][][]=new int[scl][cls][stu];
		for(int i=0;i<scl;i++) {
			System.out.println("inside school:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("inside class:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter marks of the student no:"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
		}
		}
			for(int i=0;i<scl;i++) {
				System.out.println("inside school:"+(i+1));
				for(int j=0;j<cls;j++) {
					System.out.println("inside class:"+(j+1));
					for(int k=0;k<stu;k++) {
						System.out.println("the marks of the student no:"+(k+1)+"is:"+arr[i][j][k]);
						//arr[i][j][k]=sc.nextInt();
				
			}
	}

}
	}
}
