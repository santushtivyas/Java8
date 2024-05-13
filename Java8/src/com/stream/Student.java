package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	int sid;
	String name;
	String rollno;
	String Adderesse;
	
	public  Student (int sid,String name,String rollno,String Adderess)
	{
		super();
		this.sid=sid;
		this.name=name;
		this.rollno=rollno;
		this.Adderesse=Adderesse;
	}




	public static void main(String[] args) {
		
	List<Student >slist = new ArrayList<Student>();
	slist.add(new Student(1,"Santushti","RwI21","Indore"));
	slist.add(new  Student(2,"Arpita","RwI22","Bhopal"));
	slist.add(new  Student(3,"Mayank","RwI23","Ratlam"));
	slist.add(new Student(4,"Jagrati","RWI24","Raipur"));
	slist.add(new Student(5,"Anjana","RWI25","Banglore"));
	
	
	List<Integer>statelist = slist.stream()
			.filter(p->p.sid>3)
			.map(m->m.sid)
			.collect(Collectors.toList());
	 System.out.println(statelist);
		
	}
		
		
		
	

}
