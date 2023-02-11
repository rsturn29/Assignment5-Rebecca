package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(int item) {
		if(size == items.length) {
			items= arraySizeIncrease();
		}
		items[size++]= item;

		return true;
	}

	private Object[] arraySizeIncrease() {
		Object[] newArray = new Object[size * 2];
		for(int i=0; i< size; i++) {

			 newArray[i]=items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
	
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index)throws IndexOutOfBoundsException {
		if(index >= size)throw new IndexOutOfBoundsException("Out of Bounds "); 
			return (T) items[index];
		
		
	
	}



	
}
