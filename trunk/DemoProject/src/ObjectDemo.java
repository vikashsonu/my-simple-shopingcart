

class A
{
	B b;
	int x;
	void ab()
	{
		b.ab();
		System.out.println("b.x=" +b.x);
		
	}
}
class B extends A
{
	 int x;
	 A a;
	void ab()
	{
		//b.ab();
	
		int x=20;
		System.out.println("inside class b of ab method="+x);
		this.x=30;
		x=50;
		System.out.println("inside class B after this.x=30 & (x=50)"+"= "+x);
	}
}


public class ObjectDemo {
	public static void main(String[] args) {
		
		A a=new A();
		a.b=new B();
		a.b.a=a;
		a.ab();
		a.b.ab();
		
	}

}
