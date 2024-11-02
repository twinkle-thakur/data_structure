package QuesSheet1;

public class Q_1 {
  
	public static void main(String[] args) {
		int a[]= {3,2,5,10,7,3};
	/*	int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max is "+max);
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max>a[i]&&a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		System.out.println("2nd max is "+secondMax); or*/
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if(max>a[i]&&a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		System.out.println(max+" "+secondMax);
	}

}
