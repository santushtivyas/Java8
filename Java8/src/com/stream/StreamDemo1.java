package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,433,0,1,2);
		//List<Integer>filterdlist=list.stream().filter(x-> x % 2 == 0).collect(Collectors.toList());
	//	System.out.println(filterdlist);
		//List<Integer>mappedlist = filterdlist.stream().map(x-> x / 2).collect(Collectors.toList());
		//System.out.println(mappedlist);
		List<Integer>filterdlist=list.stream()
				.filter(x-> x % 2 == 0)
				.map(x-> x / 2)
				.distinct()
				.sorted((a,b)->(b-a))
				.limit(4)
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(filterdlist);
		
		Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x ->x / 20).distinct().peek(System.out::println).max((a,b) -> b-a).get();
		System.out.println(integer);
		
//		List<Integer>collect=Stream.iterate(0, x->x+1)
//				.limit(101)
//				.skip(1)
//				.filter(x-> x % 2 == 0)
//				.map(x->x/10)
//				.distinct()
//				.peek(x-> System.out.println(x))
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(collect);
	}

}
