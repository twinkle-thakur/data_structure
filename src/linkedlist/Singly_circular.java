package linkedlist;

public class Singly_circular {
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
		 tail=head;
		 tail.next=head;
		 size++;
	 }
	 else {
		 tail.next=node;
		 tail=node;
		 tail.next=head;
		 size++;
	 }
 }
 public void addFirst(int data) {
	 Node node=new Node(data,null);
	 if(head==null) {
		 head=node;
		 tail=head;
		 tail.next=head;
		 size++;
	 }
	 else {
		 node.next=head;
		 head=node;
		 tail.next=head;
		 size++;
	 }
 }
 public void addMidd(int data,int position) {
	 Node node=new Node(data,null);
	 Node temp=head;
	 for(int i=1;i<position-1;i++) {
		 temp=temp.next;
	 }
	 node.next=temp.next;
	 temp.next=node;
	 size++;
 }
 public void deleteLast() {
	 Node temp=head;
	 for(int i=1;i<size-1;i++) {
		 temp=temp.next;
	 }
	 tail=temp;
	 tail.next=head;
	 size--;
 }
 public void deleteFirst() {
	 head=head.next;
	 tail.next=head;
	 size--;
 }
 public boolean isWithInRange(int position) {
	 return position>0&&position<=size;
 }
 public void deleteByPosition(int position) {
	 if(isWithInRange( position)) {
		 if(position==1) {
			 deleteFirst();
		 }
		 else if(position==size) {
			 deleteLast();
		 }
		 else {
			 Node temp=head;
			 for(int i=1;i<position-1;i++) {
				 temp=temp.next;
			 }
			 temp.next=temp.next.next;
			 tail.next=head;
			 size--;
		 }
	 }
 }
 public boolean isContains(int data) {
	 Node temp=head;
	for(int i=1;i<=size;i++) {
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
			if(temp.data==data) {
				return i;
			}
			temp=temp.next;
		}
		return -1;
 }
 public void deleteByData(int data) {
	 if(isContains(data)) {
		 deleteByPosition(getPosition(data));
	 }
 }
 public boolean isCircular() {
	 return head==tail.next;
 }
 public void print_1() {
	 Node temp=head;
	 for(int i=1;i<=size;i++) {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
 }
 public void print_2() {
	 Node temp=head;
	 while(temp.next!=head) {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
	 System.out.println(tail.data);
 }
 public void print_3() {
	 Node temp=head;
	 while(temp!=tail) {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
	 System.out.println(temp.data);
 }
 public int size() {
	 return size;
 }
}
