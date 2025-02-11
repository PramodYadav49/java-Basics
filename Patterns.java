class Patterns{
 public static void main(String[] args) {
    int n=5;
    patter1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
     pattern6(n);
 }
 static void patter1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    System.out.println();
 }
 static void pattern2(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    System.out.println();
 }

 static void pattern3(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" * ");
        }
        System.err.println();
    }
    System.out.println();
 }
 static void pattern4(int n){
    for(int row=1;row<n*2;row++){
       int col=row>n?2*n-row:row;
       for(int j=0;j<col;j++){
        System.out.print(" * ");
       }
       System.out.println();;
    }
 }

 static void pattern5(int n){
    for(int row=1;row<n*2;row++){
        int col=row>n?2*n-row:row;
        int space=n-col;
        for(int k=0;k<space;k++){
            System.out.print(" ");
        }
        for(int j=0;j<col;j++){
         System.out.print(" * ");
        }
        System.out.println();;
     }
 }

 static void pattern6(int n){

    for(int row=1;row<=n;row++){
        for(int space=0;space<n-row;space++){
            System.out.print(" ");
        }
        
        for(int col=row;col>=1;col--){
            System.out.print(col);
        }
        for(int col=2;col<=row;col++){
            System.out.print(col);
        }
        
        System.out.println();
    }
 }
}