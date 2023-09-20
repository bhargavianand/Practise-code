package javaimpTopics;

import java.util.ArrayList;

public class ArrayList_append {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(100);
		a1.add(101);
		a1.add(99);
		a1.add(98);

		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(200);
		temp.add(201);
		temp.add(202);

		// 4 ;
		int size = a1.size() + temp.size();
		System.out.println(size);

		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		/*
		 * for (int i = a1.size(); i < a1.size() + temp.size(); i++) { for (int j = 0; j
		 * < temp.size(); j++) {
		 * 
		 * 
		 * temp.get(j);
		 * 
		 * } }
		 */		System.out.println(a1);

	}

}
