package linkedlist;

public class Doubly_Circular {
Node head;
Node tail;
int size;

     class Node{
    	 int data;
    	 Node prev;
    	 Node next;
    	 public Node( Node prev,int data, Node next) {
			super();
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
     }
 public void addLast(int data) {
	 Node node=new Node(null,data,null);
	 if(head==null) {
		 head=node;
		 tail=head;
		 tail.next=head;
		 head.prev=tail;
		 size++;
	 }
	 else {
		 tail.next=node;
		 node.prev=tail;
		 tail=node;
		 tail.next=head;
		 head.prev=tail;
		 size++;
	 }
 }
 public void addFirst(int data) {
	 Node node=new Node(null,data,null);
	 node.next=head;
	 head.prev=node;
	 head=node;
	 tail.next=head;
	 head.prev=tail;
	 size++;
 }
 public void addMid(int data,int position) {
	 Node node=new Node(null,data,null);
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
 public void deleteByPosition(int position) {
	 if(isWithInRange(position)) {
		 if(position==1) {
			 deleteFirst();
		 }
		 else if(position==size) {
			 deleteLast();
		 }
		 else {
			 Node temp=head;
			 for(int i=1;i<position;i++) {
				 temp=temp.next;
			 }
			 temp.prev.next=temp.next;
			 temp.next.prev=temp.prev;
			 size--;
		 }
	 }
 }
 public boolean isWithInRange(int position) {
	 return position>0&&position<=size;
 }
 public void deleteFirst() {
	 head=head.next;
	 tail.next=head;
	 head.prev=tail;
	 size--;
 }
 public void deleteLast() {
	 tail=tail.prev;
	 tail.next=head;
	 head.prev=tail;
	 size--;
 }
 public boolean isCircular() {
	 return tail.next==head&&head.prev==tail;
 }
 public void print() {
	Node temp=head;
	for(int i=1;i<=size;i++) {
		System.out.println(temp.data);
		temp=temp.next;
	}
 }
 public int size() {
	 return size;
 }
 	 }
