package linkedlist;

public class Practice {
Node head,tail;
int size;
	
	public void addLast(int data) {
		Node node=new Node(null,data,null);
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
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverse() {
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		Practice p=new Practice();
		p.addLast(10);
		p.addLast(20);
		p.addLast(30);
		p.print();
		p.reverse();
	}
class Node{
	int data;
	Node next,prev;
	public Node(Node prev,int data, Node next) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
}
}

