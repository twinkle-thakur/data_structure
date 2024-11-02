package stack;

public class StackUsingArrayListCalling {

	public static void main(String[] args) {
		StackUsingArrayList s=new StackUsingArrayList();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		System.out.println(s.peek());
	    s.print();
		System.out.println(s.size());
	}

}

