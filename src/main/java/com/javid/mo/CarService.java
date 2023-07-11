package com.javid.mo;

import java.util.Arrays;
import java.util.List;

public class CarService {
	private static List<String> bookList = Arrays.asList("BMW","BENZ","KIA");

	public static List<String> getCarList() {
		return bookList;
	}

}
