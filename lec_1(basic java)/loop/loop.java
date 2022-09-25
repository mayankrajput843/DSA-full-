package lec02;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		int sum=0;
		
		
		while(i<=6) {
			System.out.println(i);
			sum = sum + i;
			i += 1;
			
		}
		System.out.println(sum);
	}

}
