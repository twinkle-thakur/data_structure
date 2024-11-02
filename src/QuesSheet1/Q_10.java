package QuesSheet1;

public class Q_10 {

	public static void main(String[] args) {
		int[] a= {34,8,10,3,2,80,30,33,1};
	//	int[] a= {1,10};
		int maxdiff=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int diff=j-i;
					if(diff>maxdiff) {
						maxdiff=diff;
					}
				}
			}
		}
		System.out.println("maximum diff is ="+maxdiff);
	}

}
