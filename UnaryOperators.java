package Day2;
//++  always increment value of variable by 1 
 // prefix increment operator   ++x
 // postfix increment operator   x++

public class UnaryOperators {

	public static void main(String[] args) {
		int x=10;
		
		//x= x+1;   or   x  +=1;   or 	x++;  //all increment value by 1
		//prefix and postfix difference will come in equation 
		int y= ++x + 10; 
		//int y= x++ + 10; 
		System.out.println(y);

	}

}
