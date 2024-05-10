package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>list = List.of("Santusht","Vyas","Arpita","Mayank","Jagrati","Anjana","Savita");
		List<String> names = list.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(names);
		

	}

}
