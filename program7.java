package Mypack;
import java.util.Scanner;
public class program7
{
	public static void main(String[] args) 
	{
		String str1, str2;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter first String");
        str1 = scanner.nextLine();
        System.out.println("Enter second String");
        str2 = scanner.nextLine();
        if (str1.equals(str2))
            System.out.print("Equal Strings");
        else
            System.out.print("UnEqual Strings");
    }
}
