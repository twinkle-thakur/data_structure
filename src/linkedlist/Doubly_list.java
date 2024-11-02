package linkedlist;



public class Doubly_list {
	Node head;
	Node tail;
	int size; 
	
       class Node{
    	   int data;
    	   Node prev;
    	   Node next;
    	   
    public Node(int data,Node prev,Node next) {
    	super();
    	this.data=data;
    	this.prev=prev;
    	this.next=next;
    }
     }
 public void addLast(int data) {
	 Node node =new Node(data,null,null);
	 if(head==null) {
		 head=node;
		 tail=head;
		 size++;
	 }
	 else {
		 tail.next=node;
		 node.prev=tail;
		 tail=node;
		 size++;
	 }
 }
 public void addFirst(int data) {
	 Node node=new Node(data,null,null);
	 node.next=head;
	 head.prev=node;
	 head=node;
	 size++;
 }
 public void addMid(int position,int data) {
	 Node node=new Node(data,null,null);
	 Node temp=head;
	 for(int i=1;i<position-1;i++) {
		temp=temp.next;
	 }
	 node.next=temp.next;
	 temp.next.prev=node;
	 node.prev=temp;
	 temp.next=node;
	 size++;
 }
 public int size() {
	 return size;
 }
 public void print() {
	 Node temp=head;
	 for(int i=1;i<=size;i++) {
	    System.out.println(temp.data);
	    temp=temp.next;
	 }
 }
 public void print_2() {
	 Node temp=head;
	 while(temp!=null) {
		 System.out.println(temp.data);
		temp= temp.next;
	 }
	 
 }
 public void deleteByPos(int position) {
	 if(position==1) {
		 deleteFirst();
	 }
	 else if(position==size) {
		 deleteLast();
	 }
	 else
	 {
		 Node temp=head;
		 for(int i=1;i<position;i++) {
			 temp=temp.next;
		 }
		 temp.prev.next=temp.next;
		 temp.next.prev=temp.prev;
		size--;	 
	 }
		 
 }
 public void deleteFirst() {
	 head=head.next;
	head.prev=null;
			size--;
 }
public void deleteLast() {
	tail=tail.prev;
	tail.next=null;
			size--;
}
public int getPosition(int data) {
	Node temp=head;
	for(int i=1;i<=size;i++) {
		
		if(temp.data==data) {
			return i;
		}
		temp=temp.next;
	}
	return -1;
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
public void deleteByData(int data) {
	if(isContains(data)) {
		deleteByPos(getPosition(data));
	}
	
}
public void reverse() {
	 Node temp=tail;
	 for(int i=1;i<=size;i++) {
		 System.out.println(temp.data);
		 temp=temp.prev;
	 }
}
}
