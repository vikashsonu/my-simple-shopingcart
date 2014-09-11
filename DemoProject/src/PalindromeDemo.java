import java.util.Scanner;


public class PalindromeDemo {
	
public static void main(String[] args) {
	Palindrome1 pd=new Palindrome1();
	pd.reverse();
	pd.display();
	
}
}
 class Palindrome1
{  int x=0;
	String str,rev_str="";
	Palindrome1()
	{
		System.out.println("Enter any string:");
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
	}
	void reverse()
	{
		int x=0;
		for(x=str.length(); x>=0; x--)
			rev_str=rev_str+str.charAt(x);
		
		
		
	}
	 void display()
	{
		if(str.equals(rev_str))
		{
			System.out.println("yes string is palindrome");
			
		}
		else
		{
			System.out.println("string is not pALINDROME");
		}
	}
}