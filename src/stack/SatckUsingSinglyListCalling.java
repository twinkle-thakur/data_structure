package stack;

public class SatckUsingSinglyListCalling {

	public static void main(String[] args) {
		StackUsingSinglyList s=new StackUsingSinglyList();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.print();
	}

}
