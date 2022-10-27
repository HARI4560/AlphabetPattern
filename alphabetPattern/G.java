//  not completed.
class G{
    public static void main(String[] args){
        int n = 7;
        int m = 6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1||j==1||i==n||i==n/2+1 && j!=2&& j!=3||j==m && i!=2&& i!=3)
                 System.out.print("* ");
                else 
                 System.out.print("  "); 
               
            }
            System.out.println();
        }
    } 
}