public class Hello{
     public static void main(String[] args){
         for(int i=1;i<=100;i++)
    { 
        	 System.out.println(show(i));
     }
 }
     public static String show(int i) { 
    	 
    	 String s =Integer.toString(i);   
    	 
    		if ((i%3==0 && i%5==0)||i==35||i==53 )	{
    			return "FizzBuzz";
    			}else if (i%3==0 || s.indexOf("3")!=-1)	{
    			return "Fizz";
    			}else if (i%5==0 || s.indexOf("5")!=-1)	{
    			return "Buzz";
    			}else {
    			return s; } 
 	} 
}
