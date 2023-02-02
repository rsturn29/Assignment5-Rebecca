package com.coderscampus.arraylist;

public class Assignment5Application {

	public static void main(String[] args) {
		CustomList<Integer> myCustomList = new CustomArrayList<>();
		for (int i = 1; i <= 50; i++) {
			myCustomList.add(i);
		}

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
