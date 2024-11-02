package arraylist;

public class Array_list_method {
int arr[];
int capacity=10;
int size;
public Array_list_method (){
	arr=new int[capacity];
}
public void add(int data) {
	if(isFull()) {
		resize();
		arr[size]=data;
		size++;
	}
	else {
		arr[size]=data;
		size++;
	}
}
public void addByIndex(int index,int data) {
	if(isWithInRange( index)) {
		if(isFull()) {
			resize();
		}
		else {
			for(int i=size;i>=index;i--) {
				arr[i]=arr[i-1];
			}
			arr[index]=data;
			size++;
		}
	}
}
public void deleteByIndex(int index) {
	if(isWithInRange(index) ) {
		for(int i=index;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	
}
public void print() {
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
	}
}
public boolean isFull() {
	return size==capacity;
}
public void resize() {
	capacity=capacity*2;
	int[] temp=new int[capacity];
	for(int i=0;i<size;i++) {
		temp[i]=arr[i];
	}
	arr=temp;
}
public boolean isWithInRange(int index) {
	return index>=0&&index<size;
}
public int get(int index) {
	if(size<0||index>size) {
		return -1;
	}
	return arr[index];
}
public int size() {
	return size;
}
}
