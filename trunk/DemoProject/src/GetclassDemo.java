
public class GetclassDemo {
public static void main(String[] args) {
	Emp e=new Emp(1, 100);
	e.disp();
	System.out.println(e.getClass());
}
}

 class Emp
{
	int id;
	int sal;
	 Emp(int i, int s)
	{
		id=i;
		sal=s;
		
	}
	public void disp()
	{
		System.out.println("salary,id="+sal +id);
	}
}
