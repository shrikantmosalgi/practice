package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(20);
		list1.add(35);
		list1.add(4);
		list1.add(55);
		list1.add(70);
		list1.add(5);
		list1.add(40);
		list1.add(75);
	
		Stream<Integer> stream = list1.stream();
		
		List<Integer> evenNumbers =stream.filter(i -> i%2 ==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		///////////////////////////// blank stream
		System.out.println("blank stream ------------------");
		Stream<Object> emptyStream =Stream.empty();
		System.out.println();
		//////////////// convert array to stream
		System.out.println("convert array to stream ------------------");
		String names[] = {"akshay","shrikant","balaji","nagesh","balaji"};
		
		Stream<String> stream1= Stream.of(names);
		
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		/////////////////list,set
		System.out.println("list,set ---------------------");
		list1.stream().forEach(e ->{
			System.out.println(e);
		});
		///////////// sort		
		System.out.println("sort-----------");
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortedDesc = list1.stream()
			    .sorted(Comparator.reverseOrder())
			    .collect(Collectors.toList());
		
		System.out.println(sortedDesc);


		////min,max
		System.out.println("min,max ----------------");
		int min =list1.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("minimum is "+min);
		
		int max =list1.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("maximum is "+max);
		////filter	
		System.out.println("filter -------------");
		List<String> nameList = new ArrayList<String>();
		nameList.add("akshay");
		nameList.add("shrikant");
		nameList.add("balaji");
		nameList.add("nagesh");
		nameList.add("abhay");
		nameList.add("aditya");
		nameList.add("siddharth");
				
		List<String> snames = nameList.stream().filter(e -> e.startsWith("s")).collect(Collectors.toList());
		System.out.println(snames);
		///map
		System.out.println("map function--------------------");
		List<Integer> squareNumbers = list1.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(squareNumbers);
		
		//
	}

}
