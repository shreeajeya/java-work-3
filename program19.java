package Mypack;
public class program19 
{
	public static void main(String[] args)
	{
		String str = "ajeya drishya";
        char ch = '@';
        int pos = 5;
        str = str.substring(0, pos) + ch + str.substring(pos + 1);
        System.out.println(str);
    }
}