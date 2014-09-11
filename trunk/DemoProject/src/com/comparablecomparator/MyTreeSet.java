package com.comparablecomparator;

import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new AgeComparator());
		//TreeSet<Test> ts=new TreeSet<Test>();
		ts.add(new Test(12,30,"vikash"));
		ts.add(new Test(100,65,"baba"));
		ts.add(new Test(32,6,"azad"));
		System.out.println(ts);
		
	}
}
