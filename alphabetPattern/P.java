class P{
    public static void main(String[] args){
        int n = 7;
        int m = 6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if((j==1||i==1||i==2||i==3||i==4)&& j!=m-1 && j!=3&& j!=2&& j!=4||i==1||i==4)
                 System.out.print("* ");
                else
                 System.out.print("  ");
            }
            System.out.println();
        }
    }
}