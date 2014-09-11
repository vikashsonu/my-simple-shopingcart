import java.util.LinkedHashSet;
import java.util.Iterator;



import java.util.Collections;
public class DemoLinkedHashSet {
public static void main(String[] args) {
	Integer x=100;
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(10);
	
	lhs.add(29);
	lhs.add(34);
	lhs.add(23);
	lhs.add(56);
	lhs.add(2);
	lhs.add(10);
	//System.out.println(lhs);
	Iterator it=lhs.iterator();
	while(it.hasNext())
	{
		

			System.out.println("value=" +it.next()+" ");
			System.out.println("hashed set contain:"+ lhs.contains(x));
			
		
	}
	 
	
	
	
}
}
