public class findUnique {
    public static void main(String[] args) {
        int arr[]={3,4,3,5,4,5,6};
        int u=unique(arr);
        System.out.println(u);
        System.out.println(3^4);
        System.out.println(184&1<<5);
            }
        
            private static int unique(int[] arr) {
                int unique=0;
               for(int n:arr){

                unique=unique^n;
               }
               return unique;
            }
}
