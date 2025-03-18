package QuestionSheet2;

public class Q_9_2 {
public static void missingAndRepeating(int[] a) {
	int missing = 0,repeating=0;
	boolean present[]= new boolean[a.length+1];
	for(int i=0;i<a.length;i++) {
		if(present[a[i]]==true) {
			repeating=a[i];
		}
		present[a[i]]=true;
	}
	for(int i=1;i<=present.length;i++) {
		if(present[i]==false) {
			missing=i;
			break;
		}
	}
	System.out.println(missing+" "+repeating);
}
public static void main(String[] args) {
	int[] a= {1,3,3};
	missingAndRepeating(a);
}
}
