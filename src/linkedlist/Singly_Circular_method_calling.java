package linkedlist;

public class Singly_Circular_method_calling {

	public static void main(String[] args) {
		Singly_circular s=new Singly_circular();
		s.addLast(12);
		s.addLast(20);
		s.addLast(10);
		s.addFirst(1);
		s.addFirst(2);
		s.addMidd(30, 3);
		s.addMidd(40, 3);
		System.out.println(s.isContains(5));
		System.out.println("*******");
		System.out.println(s.getPosition(4));
		System.out.println("*******");
		s.print_1();
		System.out.println("size is="+s.size());
	//	s.deleteLast();
	//    s.deleteLast();
	//    s.deleteFirst();
	//	s.print_2();
		s.deleteByPosition(7);
		System.out.println("size is="+s.size());
		s.deleteByData(40);
		System.out.println(s.isCircular());
	//	s.deleteByData(40);
		s.print_3();
	}

}
