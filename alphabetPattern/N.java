class N{
    public static void main(String[] args){
        int n = 6;
        int m = 6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j==1||j==m||i==j)
                 System.out.print("* ");
                else
                 System.out.print("  ");
            }
            System.out.println();
        }
    }
}