package hk.ds.sort;

import java.util.Arrays;

import test.jia.Runner;

public class HeapSort extends Runner{
	// create an array to hold the value
	int[] arr = new int[10];
	int size = 0;
	int capacity = 10;
	
	// get Parent and child index;
	public int getParentIndex(int childIndex) { return (int) Math.floor((childIndex-1)/2); }
	public int getLeftIndex(int parentIndex) { return parentIndex*2+1; }
	public int getRightIndex(int parentIndex) { return parentIndex*2+2; }
	
	// check if has parent or child
	public boolean hasParent(int childIndex) {return getParentIndex(childIndex) >= 0;}
	public boolean hasLeftChild(int parentIndex) {return getLeftIndex(parentIndex)<size;}
	public boolean hasRightChild(int parentIndex) {return getRightIndex(parentIndex)<size;}
	
	// get the value of parent and child
	public int leftChild(int index) {return arr[getLeftIndex(index)];}
	public int rightChild(int index) {return arr[getRightIndex(index)];}
	public int parent(int index) {return arr[getParentIndex(index)];}
	
	public void ensureExtraCapacity() {
		if(size == capacity) {
			arr = Arrays.copyOf(arr, capacity * 2);
			capacity *= 2;
		}
	}
	
	public int peek() {
		if(size == 0 ) throw new IllegalStateException();
		return arr[0];
	}
	
	public int poll() {
		return 1;//tbd
	}
	
	

}
