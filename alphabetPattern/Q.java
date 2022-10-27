class Q{
    public static void main(String[] args){
        int n = 9;
        int m = 8;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if((i==1||j==1||i==n-2|| j==m-2) && j!=n-2 && j!=n-1 && i!=n-1 && i!= n || (i==j+1 )&& j!=2&& j!=3 && j!= 4)
                 System.out.print("* ");
                else 
                 System.out.print("  ");
                 
            }
            System.out.println();
        }
    }
}
