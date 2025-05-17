package QuesSheet1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_9_2 {
	public static void frequency(int[] arr,int n,int p) {
		int i=0,j;
		while(i<n) {
			if(arr[i]>0&&arr[i]<n) {
				j=arr[i]-1;
				if(arr[j]<=0) {
					arr[i]=0;
					arr[j]--;
					i++;
				}	else {
					arr[i]=arr[j];
					arr[j]=-1;
				}
			}else if(arr[i]>n) {
				arr[i]=0;
				i++;
			}else {
				i++;
			}
		}
		for( i=0;i<n;i++) {
			arr[i]=Math.abs(arr[i]);
			System.out.print(arr[i]+" ");
		}
	}
	public static void usingHasMap(int[] a,int p,int n) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:a) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		int[] arr= {3,4,4,8,1,2,5};
		//frequency(arr,7 , 8);
		usingHasMap(arr, 7, 8);
	}
}
