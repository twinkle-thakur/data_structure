package QuesSheet1;

//solved by prefixsum 
public class Q_8 {
	//for finding max range in array
public static int max(int[] r) {
	int max=r[0];
	for(int i=1;i<r.length;i++) {
		if(r[i]>max) {
			max=r[i];
		}
	}
	return max;
}
 
public static int maxOccured(int l[],int r[],int max) {
	int[] count= new int[max+2];
	for(int i=0;i<r.length;i++) {
		count[l[i]]++;
		count[r[i]+1]--;
	}
	
	int maxCount=0;
	int maxIndex=0;
	for(int i=1;i< count.length;i++) {
		count[i]+=count[i-1];
		if(count[i]>maxCount) {
			maxCount=count[i];
			maxIndex=i;
		}
	}
	return maxIndex;
}
public static void main(String[] args) {
	int l[]= {1,5,9,13,21};
	int r[]= {15,8,12,20,30};
	System.out.println(maxOccured(l, r, max(r)));
//	System.out.println(max(r));
}
}
