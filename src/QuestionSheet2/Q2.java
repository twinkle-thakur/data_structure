package QuestionSheet2;

public class Q2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("even count="+countEven+"odd count  "+countOdd);
	}

}
