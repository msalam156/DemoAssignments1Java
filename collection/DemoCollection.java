package com.nissan.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
	public static void main(String[] args) {
		//non generic 
		// ArrayList
		List list = new ArrayList();
		
		// Not type safe  add() remove findAll
		
		list.add(2343.45);
		list.add("Hil");
		list.add(false);
		list.add(null);
		list.add('a');
		
		// print list 
		//for(Object item : list) System.out.println(item);
		// convert arrayList to array
		Object [] arryListToArray = list.toArray();
		// print array element
		for(int i = 0; i < arryListToArray.length; i ++) {
			System.out.println(arryListToArray[i]);
		}
		
	}
}
