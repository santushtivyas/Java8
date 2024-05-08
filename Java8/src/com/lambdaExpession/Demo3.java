package com.lambdaExpession;

interface start{
	public void run();
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=29;
	
		start d1 =()->{
			System.out.println("output"+" "+w);
		

	};
	    d1.run();

}
}
