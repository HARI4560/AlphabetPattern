class B{
    public static void main(String[] args){
        int n = 7;
        int m = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if((j==1||i==1||i==n/2+1||i==n|| j==m ) && j!=m || (i==n-2||i==n-1||i==n-4||i==n-5) && j!=2 && j!=3 && j!=4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}