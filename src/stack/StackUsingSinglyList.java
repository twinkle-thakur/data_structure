package stack;

import linkedlist.Singly_list_methods;

public class StackUsingSinglyList {
	Singly_list_methods list;
	StackUsingSinglyList(){
		list = new Singly_list_methods();
	}
	public void push(int data) {
		list.addFirst(data);
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		return list.getFirtsdata();
		
	}
	public int pop() {
		
		int data=list.getFirtsdata();
		list.deleteFirst();
		return data;
	}
	public int size() {
		return list.size();
	}
	public boolean isEmpty() {
		return list.size()==0;
	}
	public void print() {
		list.print();
	}
}
