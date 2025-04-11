package HashMap;

import java.util.HashMap;

//calculate frequency of each element in array
public class Frequency {
public static void frequencyOfElements(int[] arr) {
	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i:arr) {
		map.put(i, map.getOrDefault(i,0)+1);
	}
	System.out.println(map);
}
public static void main(String[] args) {
	int[] arr= {1,1,1,2,2,3,4,5,6,6,7};
	frequencyOfElements(arr);
}
}
