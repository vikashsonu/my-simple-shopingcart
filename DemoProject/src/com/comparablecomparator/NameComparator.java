package com.comparablecomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Test> {

	public int compare(Test obj1, Test obj2)
	{
		return obj1.name .compareTo(obj2.name);
	}
}
