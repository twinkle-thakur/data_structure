package QuestionSheet2;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class Q_5 {
	
public static void main(String[] args) {
	int[] a= {1,2,3,1,4,2};
	List<Integer> list=Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
	
	System.out.println(list);
}
}
