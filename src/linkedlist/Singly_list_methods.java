package linkedlist;

public class Singly_list_methods {
	private Node head;
	private Node tail;
	private int size;
	
	
  class Node{
	private int data;
	private Node next;
	public Node(int data,Node next){
		super();
		this.data=data;
		this.next=next;
	}
}
public void addLast(int data) {
	Node node=new Node(data,null);
	if(head==null) {
		head=node;
		size++;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		temp=node;
		size++;
	}
}
public void addLastUsingTail(int data) {
	Node node=new Node(data,null);
	if(head==null) {
		head=node;
		tail=head;
		size++;
	}
	else {
		tail.next=node;
		tail=node;
		size++;
	}
}
public void addFirst(int data) {
	Node node =new Node(data,null);
	if(head==null) {
		head=node;
		size++;
	}
	else {
		node.next=head;
		head=node;
		size++;
	}
}
public void addMid(int data,int position) {
	Node node =new Node(data,null);
	Node temp=head;
	for(int i=1;i<position-1;i++) {
		temp=temp.next;
	}
	node.next=temp.next;
	temp.next=node;
	size++;
		}
public boolean isWithInRange(int position) {
	return position>0&&position<=size;
}
public void deleteFirst() {
	head=head.next;
	size--;
}
public void deleteLast() {
	Node temp=head;
	for(int i=1;i<size-1;i++) {
		temp=temp.next;
		
	}
	temp.next=null;
	size--;
}
public void deleteByPosition(int position) {
	if(isWithInRange( position)) {
		if(position==1) {
			 deleteFirst() ;
		}
		else if(position==size) {
			deleteLast();
			}
		else {
			Node temp=head;
			for(int i=1;i<position-1;i++) {
				temp=temp.next;
			}
			Node currentPos=temp.next;
			Node nextNode=temp.next.next;
			temp.next=nextNode;
			temp=nextNode;
			currentPos.next=null;
			size--;
		}
	}
}
public boolean isContains(int data) {
	Node temp=head;
	while(temp!=null) {
		if(temp.data==data) {
			return true;
		}
		temp=temp.next;
	}
	return false;
}
public int getPosition(int data) {
	Node temp=head;
	for(int i=1;i<=size;i++) {
		if(data==temp.data) {
			return i;
		}
		temp=temp.next;
	}
	return -1;
}
public void deleteByData(int data) {
	if(isContains( data)) {
		deleteByPosition(getPosition(data));
	}
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public int size() {
	return size;
}
public void reverseByUsingarray() {
	Node temp=head;
	int[] a=new int[size];
	for(int i=0;i<size;i++) {
		a[i]+=temp.data;
		temp=temp.next;
	}
	for(int i=size-1;i>=0;i--) {
		System.out.print(a[i] +" ");
	}
}
public int getFirtsdata() {//specially created for stack pop and peek oper..
	return head.data;
}
		
}
