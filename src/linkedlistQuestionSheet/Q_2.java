package linkedlistQuestionSheet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q_2 {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	//2->2->4->5
	ll.add(2);
	ll.add(2);
	ll.add(4);
	ll.add(5);
	ll.add(4);
	Set<Integer> set=new HashSet<Integer>(ll);
	
	System.out.println(set);
}
}
