package practice;

public class SecondMax {
	
	    public static void main(String[] args) {
	        int arr[] = { 3, 4, 5, 6 ,12,1};
	        int max=0;
	        for(int i = 0 ; i < arr.length;i++){
	            if(max <= arr[i]){
	                max=arr[i];

	            }
	        }int max2;
	        if(arr[0]==max){
	            max2=arr[1];
	        }else{
	            max2=arr[0];
	        }
	        for(int i = 1 ; i < arr.length;i++){
	            if(arr[i]==max){
	                continue;
	            }else{
	            if(max2 <= arr[i]){
	                max2=arr[i];

	            }}
	        }
	        System.out.println(max2);
	        

	    }

	    
	}public class second_max {
	    public static void main(String[] args) {
	        int arr[] = { 3, 4, 5, 6 ,12,1};
	        int max=0;
	        for(int i = 0 ; i < arr.length;i++){
	            if(max <= arr[i]){
	                max=arr[i];

	            }
	        }int max2;
	        if(arr[0]==max){
	            max2=arr[1];
	        }else{
	            max2=arr[0];
	        }
	        for(int i = 1 ; i < arr.length;i++){
	            if(arr[i]==max){
	                continue;
	            }else{
	            if(max2 <= arr[i]){
	                max2=arr[i];

	            }}
	        }
	        System.out.println(max2);
	        

	    }

	    
	
}
