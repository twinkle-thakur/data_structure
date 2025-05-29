package QuestionSheet2;

import java.util.HashMap;
import java.util.Map;

public class Q_7 {
	public static boolean haveSum(int[] arr) {
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(map.containsKey(arr[i]+arr[j])) {
					return true;
				}
				map.put(arr[i]+arr[j], 0);
			}
		}
		return false;
		
	}
public static void main(String[] args) {
	int arr[] = {3, 4, 7, 1, 2, 9, 8};
	System.out.println(haveSum(arr));
}
}
