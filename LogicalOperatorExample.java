package Day2;
//logical operator  && || and not  !

//wap to check if a given number is in range of 20 and 50 

public class LogicalOperatorExample {

	public static void main(String[] args) {
	     //int 6s1;//incorrect
		//int $a;//correct 
		//int &s;  //incorrect
		//int _u;//correct 
		
		int y=62;
		System.out.println(y>=20 && y<=50);//ion case of and operator all conditions must be true 

		// check if deptno of a person is either 10 or 20 or 30
		int deptno =23;
		// in case of or operator either of condition must true then answer is true 
		
		System.out.println(deptno ==10 || deptno==20 ||deptno== 30);
		
		System.out.println( !(y==10));
		
		                     
		
		

	}

}
