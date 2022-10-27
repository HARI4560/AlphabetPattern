class A{
    public static void main(String[] args){
            int n=8;

       if(n==7||n==8||n==9){
           
          for(int i=1; i<=n; i++){
               for(int j=1; j<=n; j++){
                 if(i==1||j==1||j==n||i==n-2||i==2||j==2||i==n-3||j==n-1)
                    System.out.print("* ");
                 else
                    System.out.print("  ");
                }
               System.out.println();
           }
        }else{
               System.out.print("Eligible numbers = 7, 8, 9");
            } 
      }
}