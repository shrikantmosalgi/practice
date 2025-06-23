package com.java8.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String str =null;

		Optional<String> optionalStr = Optional.ofNullable(str);
		
		System.out.println(optionalStr.isPresent());
		//System.out.println(optionalStr.get());
		System.out.println();
		
	}

}
