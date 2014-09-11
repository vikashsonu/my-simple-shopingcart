
public class ReverseString {
	public static void main(String[] args) {
 
		String s1="vikash kumar";
		System.out.println("reverse of string="+revstr(s1));
	
	}

public static String revstr(String s1)
{
	int x=0,y=s1.length()-1;
	char c[]=s1.toCharArray();
	while(x<y)
	{
		char tmp=c[x];
		c[x]=c[y];
		c[y]=tmp;
       x++;
       y--;
       
	}
	return new String(c);
			
}
}