package Mypack;
import java.util.Scanner;
public class program24 {
	public static String removeLeadingZeroes(String str) {
	      String strPattern = "^0+(?!$)";
	      str = str.replaceAll(strPattern, "");
	      return str;
	   }
	   public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter an integer: ");
	      String num = sc.next();
	      String result = program24.removeLeadingZeroes(num);
	      System.out.println(result);
	   }
	}