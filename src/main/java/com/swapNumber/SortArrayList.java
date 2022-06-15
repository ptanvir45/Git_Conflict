package com.swapNumber;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("Miraz");
		abc.add("Asif");
		abc.add("Tanvir");
		abc.add("Imam");
		
		
		Collections.sort(abc);
	
		System.out.println(abc);
	}

}
