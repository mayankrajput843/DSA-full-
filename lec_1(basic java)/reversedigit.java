package saturdayassignment;

public class reversedigit {

	public static void main(String[] args) {
		int n=1234;
		int rem;
		
		System.out.print(n%10);// 4
		n=n/10; 
		System.out.print(n%10);
	    n=n/10; 	
		System.out.print(n%10);
	    n=n/10; 	
		System.out.print(n%10);
	
		
//		for(n=1234;n!=0;)
//		{
//			System.out.print(n%10);
//			n=n/10;
//		}
		
		
//		for(n=1234 ;n!=0; n=n/10)  //n=1234  123  12  1 0
//		{
//			 rem= n%10;         //4  3  2  1
//			System.out.println(rem);
//		}


	}

}
