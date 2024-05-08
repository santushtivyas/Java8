package com.lambdaExpession;

@FunctionalInterface
interface EvenOdd{
	void check(int a);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOdd evenodd =(a) ->{
			if (a % 2==0) {
				System.out.println("Number " + a +  " is even");
			}else {
				System.out.println("Number+ a + is odd");
			}
		};
		evenodd.check(10);

	}

}
