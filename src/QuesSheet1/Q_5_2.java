package QuesSheet1;

public class Q_5_2 {
    
	public static void main(String[] args) {
		int[] a= {2,4,6,810,12,14,16,18,20};
		int d=3;
        int[] temp= new int[d];
        for(int i=0;i<d;i++) {
        	temp[i]+=a[i];
        }
       for(int i=0;i<a.length-d;i++) {
    	   a[i]=a[i+d];
       }
       
       System.out.println();
	}

}
