public class R{
    public static void main(String [] args){
        int n  = 8;
        int m = 5;

        for(int i=1; i<= n; i++){
            for(int j=1; j<=m; j++){
                if((i==1|| j==1|| j==m|| i==n/2+1) && (i!=n-1 && i!=n && i!=n-2)||j==1 || i==j+3)
                  System.out.print("* ");
                else
                  System.out.print("  "); 
            }
            System.out.println(); 
        }

    }
}