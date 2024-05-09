package com.lambdaExpession;

interface in1
{
	public void show(int x,int y);
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in1 i1 =(x,y)->{
			System.out.println(x*y);
		};
		i1.show(20, 10);

	}
}
