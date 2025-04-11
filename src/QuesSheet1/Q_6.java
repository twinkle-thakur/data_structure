package QuesSheet1;
//brutforce method 
//time complexity=O(n^2)
public class Q_6 {
	public static int equilibrium(int[] a1) {
		for(int i=0;i<a1.length;i++) {
			int leftSum=0;
			int rightSum=0;
			for(int j=i-1;j>=0;j--) {
				leftSum+=a1[j];
			}
			for(int k=i+1;k<a1.length;k++) {
				rightSum+=a1[k];
			}
			if(leftSum==rightSum) {
			return i+1;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] a= {1,3,5,2,2};
	if(equilibrium(a)>-1) {
		System.out.println("equilibrium poin is: "+equilibrium(a));
	}
	else {
		System.out.println("no such point");
	}
	
}
}
