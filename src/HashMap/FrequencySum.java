package HashMap;

import java.util.HashMap;
import java.util.Map;

//calculate frequency of element and sum all freq greater than 1
public class FrequencySum {
	public static int frequencySum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int sum = 0;
		for (int i : map.keySet()) {
			if (map.get(i) > 1) {
				sum += map.get(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 2, 1, 1,1 };
		
		System.out.println(frequencySum(arr));
	}

}
