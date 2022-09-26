package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	// Create a counter variable to keep track of items added to our array
	int counter = 0;

	@Override
	public boolean add(T item) {
		// Increment by 1 each time this method gets called
		counter = counter + 1;

		// Create a variable to store the value we get from counter
		int newSize = counter;

		// loop items array through counter of times
		for (int i = 0; i < counter; i++) {

			// Add "item" if the current item of the array is null.
			if (items[i] == null) {
				items[i] = item;
				items = Arrays.copyOf(items, newSize);

				break;
			}

			else
				// If the current item "items[i]" is not null then call Arrays.copyOf with
				// newSize

				items = Arrays.copyOf(items, newSize);

		}

		return true;

	}

	@Override
	public int getSize() {
		return items.length;
	}

	@Override
	public T get(int index) {
		for (int i = 0; i < items.length;) {
			return (T) items[index];
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", getSize()=" + getSize() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
