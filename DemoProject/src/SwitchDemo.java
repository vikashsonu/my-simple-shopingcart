import java.util.Scanner;


public class SwitchDemo {

	public static void main(String[] args) {
		
		int x;
		int y;
		
	System.out.println("enter first number:");
	Scanner scn=new Scanner(System.in);
	  x= scn.nextInt();
	  System.out.println("enter second number:");
	  y=scn.nextInt();
	  
	  int choice;
	  System.out.println("enter 1 TO 4 respectively for add,sub....");
	  choice=scn.nextInt();
	  
	  switch (choice)
	  {
	  
	  
	  
	  case 1:
		int  z=x+y;
		System.out.println("result="+z);
		  break;
	  case 2:
		   z=x-y;
		   System.out.println("result="+z);
		   break;
	  case 3:
		   z=x*y;
		   System.out.println("result="+z);
		   break;
	  case 4:
	  z=x/y;
	  System.out.println("result="+z);
	  break;
	  }
	  
	}
}
