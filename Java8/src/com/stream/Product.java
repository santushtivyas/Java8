package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	int sid;
	String name;
	String number;
	String Quality;
	
	Product(int sid,String name,String number,String Quality)
	{
		super();
		this.sid=sid;
		this.name=name;
		this.number=number;
		this.Quality=Quality;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>pl=new ArrayList<Product>();
		pl.add(new Product(1,"TV","Tv20","Good"));
		pl.add(new Product(2,"Coller","Coller35","VeryGood"));
		pl.add(new Product(3,"Phone","phone70","Good"));
		
		List<Integer>listp = pl.stream()
				.filter(p->p.sid>2)
				.map(m->m.sid)
				.collect(Collectors.toList());
		
		System.out.println(listp);

	}

}
