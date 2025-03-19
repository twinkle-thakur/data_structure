package linkedlistQuestionSheet;

import java.util.LinkedList;

public class Q_1 {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(6);
	ll.add(2);
	ll.add(10);
	ll.add(7);
	ll.add(5);
	ll.add(6);
	
	int sum=0;
	if(ll.size()%2==0) {
		 sum=(ll.size()/2)+1;
	}
	else {
		sum=(ll.size()+1)/2;
	}
	System.out.println(ll.get(sum-1));
}
}
