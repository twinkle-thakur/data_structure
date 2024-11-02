package linkedlist;

public class Doubly_Circular_calling {

	public static void main(String[] args) {
		Doubly_Circular d=new Doubly_Circular();
		d.addLast(1);
		d.addLast(2);
		d.addLast(3);
		d.addFirst(0);
		d.addFirst(5);
		d.addMid(3, 3);
		d.addMid(4, 4);
		d.print();
		System.out.println("********");
		//d.deleteFirst();
	//	d.deleteLast();
		d.deleteByPosition(4);
		d.print();
		System.out.println("size="+d.size()+d.isCircular());
	}

}
