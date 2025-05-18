package QuestionSheet2;

import java.util.Arrays;

public class Q_3_2 {
public static void evenOdd(int[] a) {
	int n=a.length;
int[] even=new int[n];
int[] odd=new int[n];
int e=0,o=0;
for(int i=0;i<n;i++) {
	if(a[i]%2==0) {
		even[e++]=a[i];
	}else {
		odd[o++]=a[i];
	}
}
Arrays.sort(even,0,e);
Arrays.sort(odd,0,o);
int index=0;
for(int i=0;i<e;i++) {
	a[index++]=even[i];
}
for(int i=0;i<o;i++) {
	a[index++]=odd[i];
}
}
public static void main(String[] args) {
	int a[] = {1,2,1,2,4,6,4,9};
	evenOdd(a);
	for(int num:a) {
		System.out.print(num+" ");
	}
}
}
