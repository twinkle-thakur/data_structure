package QuesSheet1;

public class Q_9 {

	public static void main(String[] args) {
		int[] a= {2,3,2,3,5};
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(i==a[j]) {
				count++;
				}
			}
			System.out.print(count+" ");
			count=0;
		}
		
	}

}
