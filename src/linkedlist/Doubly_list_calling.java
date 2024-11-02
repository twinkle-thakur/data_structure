package linkedlist;

public class Doubly_list_calling {

	public static void main(String[] args) {
		Doubly_list d=new Doubly_list();
		d.addLast(12);
		d.addLast(20);
		d.addLast(30);
		d.addMid(2, 50);
	//	d.deleteByPos(1);
		//d.deleteLast();
		//d.deleteFirst();
		//d.reverse();
		//d.deleteLast();
		d.deleteByData(50);
		d.print_2();
	}

}
