package QuesSheet1;

public class Q_5 {
public static void reverse(int[] a,int start,int end) {
//	 start=a[0];
//	 end=a.length;
	 while(start<end) {
		 int temp=a[start];
		 a[start]=a[end];
		 a[end]=temp;
		 start++;
		 end--;
	 }
}
public static void rotateRight(int[] a,int d) {
	d=d%a.length;
	reverse(a, 0, a.length-1);
	reverse(a, 0, d-1);
	reverse(a, d, a.length-1);

}
public static void rotateLeft(int[] a,int d) {
	d=d%a.length;
	reverse(a, 0, d-1);
	reverse(a, d, a.length-1);
	reverse(a, 0, a.length-1);
}

public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	rotateLeft(a, 2);
	for(int i:a) {
		System.out.print(i+" ");
	}
}
}
