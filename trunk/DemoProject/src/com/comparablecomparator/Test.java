package com.comparablecomparator;

public  class Test implements Comparable<Test>
{
int value;
String name;
int age;

public Test(int v, int a, String n)
{
this.value=v;

this.age=a;
this.name=n;
}
public String toString()
{
	return "Test[value="+value+",Age="+age+",Name="+name+"]";
	
			
}
@Override
public int compareTo(Test obj)
{
	if(this.value>obj.value)
	{
		return 1;
		
	}
	else if(this.value<obj.value)
	{
		return -1;
		
	}
	else
	{
		return 0;
	}
}



}
