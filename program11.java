package Mypack;  
import java.text.SimpleDateFormat;  
import java.util.Date;
public class program11 
{
	public static void main(String[] args)throws Exception 
	{  
	    String sDate1="20/02/2000";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	}  
}  