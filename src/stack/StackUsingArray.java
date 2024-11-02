package stack;

public class StackUsingArray {
int a[];
int size;
int top=-1;
StackUsingArray(){
	a=new int[5];
}
public void push(int data) {
	if(size==a.length) {
		System.out.println("stack overflow");
	}
	else {
		a[size]=data;
		size++;
		top++;
	}
}public int pop() {
	if(top==-1) {
		System.out.println("stack underflow");
		return -1;
	}
	
		int data=a[top];
		top--;
		size--;
	    return data;
}
public int peek() {
	if(top==-1) {
		System.out.println("stack underflow");
		return -1;
	}
	return a[top];
}
public void print() {
	for(int i=size-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
public boolean isEmpty() {
	return top==-1;
}
public int size() {
	return size;
}
}
