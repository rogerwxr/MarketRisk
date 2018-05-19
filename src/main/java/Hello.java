public class Hello{
     public static void main(String[] args){
         for(int i=1;i<=100;i++)
    { 
        	 System.out.println(show(i));
     }
 }
     public static String show(int i) {  
    		if (i%3==0 && i%5==0)	{
    			return "FizzBuzz";
    			}else if (i%3==0)	{
    			return "Fizz";
    			}else if (i%5==0)	{
    			return "Buzz";
    			}else {
    			return Integer.toString(i); } 
 	} 
}
