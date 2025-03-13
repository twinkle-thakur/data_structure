package QuesSheet1;

public class Q_6_2 {
public static int equilibrium(int[] a) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	int rightSum=0;
	for(int i=0;i<a.length;i++) {
		sum-=a[i];
		if(sum==rightSum) {
			return i+1;
		}
		rightSum+=a[i];
	}
	return -1;
}
public static void main(String[] args) {
	int[] a= {1,3,5,2,2};
	if(equilibrium(a)>-1) {
		System.out.println("equlibrium point is at position:"+equilibrium(a));
	}
	else {
		System.out.println("no euilibrium point");
	}
}
}
