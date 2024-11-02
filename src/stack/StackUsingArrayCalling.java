package stack;

public class StackUsingArrayCalling {

	public static void main(String[] args) {
		StackUsingArray s=new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.print();
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		s.print();
	}

}
