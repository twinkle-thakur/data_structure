package recursion;

public class Sumofn_no_1 {
int sum(int b) {
	if(b>0) {
	return b+=sum(b-1);
	}
	else 
		return 0;
}
public static void main(String[] args) {
	Sumofn_no_1 s=new Sumofn_no_1();
	int a=s.sum(4);
	System.out.println(a);
}
}
