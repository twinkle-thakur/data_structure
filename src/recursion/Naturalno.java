package recursion;

public class Naturalno {
public static void  factorial(int fact) {
	if(fact>=6) {
		return ;
	}
	else
		System.out.println(fact);
	fact++;
	factorial(fact);
}
	public static void main(String[] args) {
		factorial(1);
	}

}
