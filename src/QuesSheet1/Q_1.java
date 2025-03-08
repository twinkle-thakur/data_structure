package QuesSheet1;

public class Q_1 {
	public static boolean isSame(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i]!=a[a.length-1-i])
			return false;
	}
	return true;
	}
	public static void highestAndSecond(int a[]) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		if(isSame( a)) {
			System.out.println("-1");
			return ;	
		}
		else {
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
		
	public static void main(String[] args) {
		int a[]= {3,2,5,10,7,3};
		int a2[]= {1,1,1,1};
		Q_1.highestAndSecond(a2);
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
		
		}
		

}
