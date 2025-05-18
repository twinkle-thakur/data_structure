package QuesSheet1;

public class Q_10_2 {
	public static int maxIndexDiff(int[] a) {
		int n=a.length;
		int[] rightMax=new int[n];
		rightMax[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(a[i], rightMax[i+1]);
		}
		
		int i=0,j=0,maxDiff=0;
		while(i<n&&j<n) {
			if(a[i]<rightMax[j]) {
				maxDiff=Math.max(maxDiff, j-1);
				j++;
			}else {
				i++;
			}
		}
		return maxDiff;
		
	}
	public static int maxIndexDiff2(int[] a) {
		int low=0,high=a.length-1,ans=0;
		while(low<=high) {
			if(a[low]<=a[high]) {
				ans=Math.max(ans, high-low);
				low++; high=a.length-1;
			}else {
				high--;
			}
		}return ans;
	}
	public static void main(String[] args) {
		int[] a= {34, 8, 10, 3, 2, 80, 30, 33, 1};
		System.out.println(maxIndexDiff(a));
		//System.out.println(maxIndexDiff2(a));
	}
}
