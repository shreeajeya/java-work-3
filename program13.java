package Mypack;
public class program13 
{
	public static void main(String[] args)
	{
		 String string = "hello";
	        boolean numeric = true;

	        try
	        {
	            Double num = Double.parseDouble(string);
	        }
	        catch (NumberFormatException e)
	        {
	            numeric = false;
	        }

	        if(numeric)
	            System.out.println(string + " is a number");
	        else
	            System.out.println(string + " is not a number");
	 }
}
