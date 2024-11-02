package QuesSheet1;

public class Q_5 {

	public static void main(String[] args) {
	//	int[] a= {1,2,3,4,5};
		int[] a= {2,4,6,8,10,12,14,16,18,20};
		int d=3
				;//step size 
		for(int i=0;i<d;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
