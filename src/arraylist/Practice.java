package arraylist;

public class Practice {
int size,capacity=5;
int[] a;
public Practice() {
	a=new int[capacity];
	}
public void add(int data) {
//1)check if the array is full
	if(size==capacity) {
//if full then create temp array of capacity double than the prev array
		capacity=capacity*2;
		int[] temp=new int[capacity];
//copy value of a[]	to temp[]	
		for(int i=0;i<size;i++) {
			temp[i]=a[i];
		}
//point a to temp
		a=temp;
//add data then increace size
		a[size]=data;
		size++;
	}
	else {
		a[size]=data;
		size++;
	}
}
public boolean isWithInRange(int index) {
	return index>=0&&index<size;
}
public void addByIndex(int index) {
	if(isWithInRange(index)) {
		
	}
}
public void print() {
	for(int i=0;i<size;i++) {
		System.out.print(a[i]+" ");
	}
}
public int size() {
	return size;
}
public static void main(String[] args) {
	Practice p=new Practice();
	p.add(10);
	p.add(56);
	p.add(56);
	p.add(56);
	p.add(56);
	p.add(56);
	p.add(56);
	p.print();
System.out.println(p.a.length+" "+p.size());
}
}
