package Mypack;
public class program17 {
	public static void main(String[] args) {
	    String txt = "ajeya";
	    String str1 = "drishya";
	    String str2 = "friends";
	    boolean result = txt.contains(str1);
	    if(result) {
	      System.out.println(str1 + " is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string.");
	    }

	    result = txt.contains(str2);
	    if(result) {
	      System.out.println(str2 + " is present in the string.");
	    }
	    else {
	      System.out.println(str2 + " is not present in the string.");
	    }
	  }
	}
