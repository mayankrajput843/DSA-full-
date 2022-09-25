package lec02;

import java.util.Scanner;

public class loop3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row =1;
		int star = n;
		
		
		while(row<= n ) {
			int val = 1;
			
			int i=1;
			while(i<=star) {
				System.out.print(val);
				i++;
				val++;//val bhar lelu to again start suru se
				
			}
			
			
			System.out.println();
			row++;
			star--;
			
		}

}
}

