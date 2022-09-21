package Day2;
//example wap to check if person age >18 allow for voting 
//if age >18 then print allowed for voting else print not allowed
public class ConditionalStatement1 {

	public static void main(String[] args) {

    int age=18;
    if (age >=18) 
      {
    	System.out.println("allowed");
      }
    else
       System.out.println("not allowed");
     //-------------------------------------------------
    float r=10.2f;
    //all decimal values in program are considered double 
    if (r==10.2f)
    	System.out.println("values are same ");
    else
    	System.out.println("values are not same");
    //-------------------------------------
    //char  a='r';
    //if( a=='r')
    
    int y=100;
    boolean b= y>150;
    if(b==true) System.out.println("boolean value is true");
    else
    	System.out.println("sorry");
	 
	}
}
