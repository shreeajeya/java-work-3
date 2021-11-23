package Mypack;
import java.lang.*;
public class program27
{
	public static void main(String[] args)
	{
		 String str = "HELLO AJEYA";
	      String newSub = "GOOD MORNING ";
	      int index = 5;
	      System.out.println("Initial String = " + str);
	      System.out.println("Index where new string will be inserted = " + index);
	      StringBuffer resString = new StringBuffer(str);
	      resString.insert(index + 1, newSub);
	      System.out.println("Resultant String = "+resString.toString());
	}
}