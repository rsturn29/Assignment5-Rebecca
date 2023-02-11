package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	//step 1- write failing test
	// step 2-write business logic  to make test pass
	// step 3- Refactor code
	
	@Test
	void should_add_one_item_to_list() {
			//Three A's
			//Arrange, Act, Assert
		
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(10);
		
		assertEquals(10, sut.get(0));
		assertEquals(1, sut.getSize());
	}
	@Test
	void should_add_11_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(1);sut.add(2);sut.add(3);
		sut.add(4);sut.add(5);sut.add(6);
		sut.add(7);sut.add(8);sut.add(9);
		sut.add(10);sut.add(11);
		
		
		for(int i=0; i<10; i++) {
		assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}
	@Test
	void should_add_21_items_to_list() {
	CustomList<Integer> sut = new CustomArrayList<>();
	
	for(int i=1; i< 22; i++) {
		sut.add(i);
	}
	
	for(int i=0; i<21; i++) {
	assertEquals(i+1, sut.get(i));
	}
	assertEquals(21, sut.getSize());

}
}