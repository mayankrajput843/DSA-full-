package lec02;

import java.util.Scanner;

public class pattern04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row<=n) {  // for row
			
			int i=1;// for space
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j =1; //for star
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			star++;
			space--;
			
		}
		
		

	}

}
