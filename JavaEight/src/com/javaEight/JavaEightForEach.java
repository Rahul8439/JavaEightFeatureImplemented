package com.javaEight;

import java.util.ArrayList;
import java.util.List;

public class JavaEightForEach {

	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Shubham");
		list.add("Satyam");
		list.forEach((n) -> {
			if (!n.equals("Rahul")) {
				System.out.println(n);
			}
		});
	}

}
