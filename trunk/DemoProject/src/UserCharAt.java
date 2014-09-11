
public class UserCharAt {			
	public static void main(String[] args) {
		String st=null;
		int x=2;
		char ch=charAtPosIs(x);
		System.out.println(ch);
				
	}
static	char charAtPosIs(int x)
	{
	
	String st="vikash";
	char c[]=st.toCharArray();
//	for(int y=0 ;y<st.length(); y++)
	//{
		//if(x==y) {
			System.out.println("success");
			System.out.println(c[x]);
			
	    //break;    
		//}
			
	
	return (char)x;
}
}