package QuestionSheet2;

import java.util.Arrays;

public class Q_9 {
public static void missingAndRepeating(int[] arr) {
	Arrays.sort(arr);
	int a=0,b=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=1+i) {
			a=i+1;
			b=arr[i];
			break;
		}
		
	}
	System.out.println("missing :"+a+" "+" repeating :"+b);
}
public static void main(String[] args) {
	int[] a= {1, 3, 3};
	missingAndRepeating(a);
}
}
