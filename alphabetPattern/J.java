class J{
    public static void main(String[] args){
        int n = 7;
        int m = 6;

        for(int i=1; i<=n; i++){
         for(int j=1; j<=m; j++){
           if((i==1||i==n|| j==m/2+1) && j!=m && j!=m-1|| i==1)
             System.out.print("* ");
            else if((i==n-1||i==n-2) && j!=m-3 && j!=m-4 && j!=m-1 && j!=m)
              System.out.print("* ");
            else
              System.out.print("  ");  
          }
         System.out.println();
        }
        
    } 
}