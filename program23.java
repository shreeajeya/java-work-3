package Mypack;
public class program23
{
	public static void main(String[] args)
	{
		 String str = "HI GOOD MORNING";
	      char c[] = str.toCharArray();
	      System.out.println("The first character of each word: ");
	      for (int i=0; i < c.length; i++) 
	      {
	         if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) 
	         {
	            System.out.println(c[i]);
	         }
	      }
    }
}
