import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class CollectionDemo {

	
	public static void main(String[] args) {
	ArrayList list=new  ArrayList();
	list.add(11);
	list.add(1234);
	list.add(4567);
	ArrayList list1=new ArrayList();
	  list1.add(91);
	  list1.add(02);
	  list1.add(03);
	  list1.add(04);
	  ArrayList list2 =new ArrayList();
	    list2.add(11);
	    
	    list2.add(21);
	    list2.add(33);
	    list.add(44);
	  System.out.println("kkk"+list1);
		
	/*	Map<String, Integer> map=new HashMap<String,Integer>(); 
		
		map.put("1", 10);
		map.put("2", 20);
		map.put("3", 78);
		map.put("4", 45);
		map.put("5", 34);
		
		System.out.println(map);
		Set<String> set=map.keySet();
		
		for(String key:set)
		{
			int value=(Integer)map.get(key);
			System.out.println(key +",, "+value);
		}*/
	
		Map<String, ArrayList<Integer>  > map2=new HashMap<String, ArrayList<Integer> >();
		map2.put("1", list);
		map2.put("2", list1);
		map2.put("3", list2);
		Set<String> set1=map2.keySet();
		
		 
			
		for (String key1 : set1) {
			
		
		//{
			
		//	Iterator<ArrayList> it=list.iterator();
			//while(it.hasNext())
			//{
		//	System.out.println(key1.valueOf(key1));	
			ArrayList a=new ArrayList();
			a=map2.get(key1);
			System.out.println("kaa haal baa:"+a);
					
				
		//	System.out.println("good byeee all=" + it.next());	
			}
		//	Iterator<ArrayList> it1=list1.iterator();
			
		
		
		System.out.println("------"+map2);
	}
		
		
		
	}

