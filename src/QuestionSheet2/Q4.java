package QuestionSheet2;

public class Q4 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int l=2;
		int r=4;
		for(int i=0;i<a.length;i++) {
			if(i+1>=l&&i+1<=r) {
				for(int j=r-1;j>=l-1;j--) {
					System.out.print(a[j]+" ");
					i++;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
