package QuestionSheet2;

import java.util.PriorityQueue;

public class Q_6 {
public static int minimizeSum(int[] a) {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	//adding all elements to min heap
	for(int i=0;i<a.length;i++) {
		pq.add(a[i]);
	}
	int ans=0;
	while(pq.size()!=1) {
		int first=pq.poll();//extracting 1st smallest elements
		int second=pq.poll();//extracting 2nd smallest elements
		int sum=first+second;
		pq.add(sum);
		ans+=sum;
	}
	return ans;
}
public static void main(String[] args) {
	int[] a= {1, 3, 7, 5, 6};
	System.out.println(minimizeSum(a));
}
}
