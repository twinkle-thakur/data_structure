package QuesSheet1;

public class Q_4 {
	public static void sort(int a[],int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);
		}
	}
    public static double mean(int a[],int n) {
    	int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		float mean = sum / n;
		return mean;
    }
    public static void median(int a[],int n) {
    	sort(a,n);
		if (n % 2 != 0) {// for odd
			System.out.println("median is = " + a[(n + 1) / 2]);
		} else {// for even
			System.out.println("median is = " + a[(n / 2 + n / 2 + 1) / 2]);
		}
    }
	public static void main(String[] args) {
		int n = 5;// size of array
		int a[] = { 1, 2, 19, 28, 5 };
	//	
	//	System.out.println("mean is =" + mean(a,n));
	//	median(a,n);
		sort(a,n);
			}
}
