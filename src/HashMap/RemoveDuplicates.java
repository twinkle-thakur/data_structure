package HashMap;

import java.util.HashMap;

//remove duplicates from arrays
public class RemoveDuplicates {
	public static void removeDuplicates(int[] arr) {
		int n=arr.length;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, 0);
		}
		for(int i:map.keySet()) {
			System.out.print(i+" ");
		}
	}
	
public static void main(String[] args) {
	int[] arr= {2,2,2,3,4,3,1,3,34,5};
	removeDuplicates(arr);
}
}
