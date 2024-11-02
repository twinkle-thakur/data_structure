package QuestionSheet2;

public class Q1 {
   public static boolean isPalindrome(int[] a) {
	  for(int i=0;i<a.length;i++) {
		  if(a[i]!=a[a.length-i-1]) {
			  return false;
		  }
	  }
	return true;
	   
   }
	public static void main(String[] args) {
		int[] a={1,2,3,2,1};
		if(isPalindrome(a)) {
			System.out.println("palindrome array");
		}
		else {
			System.out.println("not");
		}
	}

}
