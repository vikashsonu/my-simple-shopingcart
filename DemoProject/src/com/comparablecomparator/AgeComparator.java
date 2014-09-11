package com.comparablecomparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Test>
{
public int compare(Test obj1, Test obj2)
{
	if(obj1.age>obj2.age)
	{
		return 1;
		
	}
	else if(obj1.age<obj2.age)
	{
		return -1;
		
	}
	else
	{
		return 0;
		
	}
}

}
