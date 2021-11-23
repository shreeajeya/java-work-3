package Mypack;
public class program18 {
	 public static char
	    getCharFromString(String str, int index)
	    {
	        return str.charAt(index);
	    }
	    public static void main(String[] args)
	    {
	        String str = "Ajeya";
	        int index = 3;	  
	        char ch = getCharFromString(str, index);  
	        System.out.println("Character from " + str + " at index " + index + " is " + ch);
	    }
	}
