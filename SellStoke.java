package practice;

public class SellStoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,3,8,1,4};
		int prefixMin[]=new int[arr.length];
		prefixMin[0]= arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixMin[i]=Math.min(prefixMin[i-1], arr[i]);
			
		}for(int i=0;i<arr.length;i++) {
		  arr[i]=arr[i]-prefixMin[i];}
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);
	}

}
