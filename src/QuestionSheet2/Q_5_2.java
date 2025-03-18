package QuestionSheet2;

import java.util.HashSet;
import java.util.Set;

public class Q_5_2 {
public static void main(String[] args) {
	int[] a= {1,2,3,1,4,2};
	Set<Integer> set=new HashSet<Integer>();//we can use linkedhashset also if we want to preserve order
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
	System.out.println(set);
}
}
