package QuestionSheet2;

import java.util.Arrays;

public class Q_3 {
public static void evenAndOddSort(int[] a) {
	int left=0;
	int right=a.length-1;
	while(left<right) {
		while(left < right&&a[left]%2==0) {
			left++;
			
		}
		while(left < right&&a[right]%2!=0) {
			right--;
		}
		int temp=a[right];
		a[right]=a[left];
		a[left]=temp;
		left++;
		right--;
		
	}
	Arrays.sort(a, 0, left); //sort includes 1 index but exclude last index
	Arrays.sort(a, left, a.length);
	for(int i:a) {
		System.out.print(i+" ");
	}
}
public static void main(String[] args) {
	int[] a= {12,34,45,9,8,90,3};
	evenAndOddSort(a);
}
}
