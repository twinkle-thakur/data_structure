package QuestionSheet2;

public class Q8 {
	public static int magicalNo(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==i) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] a= {-2,-1,2,4,6};
	System.out.println(magicalNo(a));
}
}
