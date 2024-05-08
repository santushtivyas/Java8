package com.lambdaExpession;

@FunctionalInterface
interface Even{
	 void check(int a);
}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		
		Even even = (a) -> System.out.println(a%2==0);
		even.check(8);
			
		}

	}


