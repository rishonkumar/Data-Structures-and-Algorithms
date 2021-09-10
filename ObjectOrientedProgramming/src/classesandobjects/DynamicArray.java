package classesandobjects;

public class DynamicArray {
	
	
	private int data[];
	private int nextElementIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex=0; //If array is empty then the first element will go to index '0'
		
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty(){
		return nextElementIndex == 0;
	}
	
	public int get(int i) {
		//element at index i
		if(i>=nextElementIndex) {
			//Throw Error
			return -1;
		}
		return data[i];
	}
	
	public void set(int i, int element) {
		if(i>=nextElementIndex) {
			//error
			return;
		}
		data[i]=element;
	}
	
	public void add(int element) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = element;
		nextElementIndex++;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int removeLast() {
		if(nextElementIndex==0) {
			//no array
			return -1;
		}
		int temp = data[nextElementIndex-1]; // to access the last element
		nextElementIndex--;
		return temp;
	}
}
