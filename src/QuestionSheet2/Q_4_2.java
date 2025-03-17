package QuestionSheet2;
//time complexity o(n)
public class Q_4_2 {
public static void reverse(int[] a,int start,int end) {
	start=start-1;
	end-=1;
	while(start<end) {
		int temp=a[end];
		a[end]=a[start];
		a[start]=temp;
		start++;
		end--;
	}
	for(int i:a) {
		System.out.print(i+" ");
	}
}
public static void main(String[] args) {
	int[] a= {1, 2, 3, 4, 5, 6, 7};
	reverse(a, 2, 4);
}
}
