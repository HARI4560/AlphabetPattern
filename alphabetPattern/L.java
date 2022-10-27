class L{
    public static void main(String[] args){
        int n = 6;
        int m = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j==1||i==n)
                 System.out.print("* ");
                else
                 System.out.print(" "); 
            }
            System.out.println();
        }
    }
}