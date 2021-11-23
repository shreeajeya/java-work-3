package Mypack;
import java.util.Arrays;
public class program21 
{
	 static void sortString(String str) 
	 {
	        char []arr = str.toCharArray();
	        Arrays.sort(arr);
	        System.out.print(String.valueOf(arr));
	 }
	    public static void main(String[] args) 
	    {
	        String s = "ArisGlobal";
	        sortString(s);
	    }
}
