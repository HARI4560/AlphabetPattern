public class S{
    public static void main(String[] args){
        int m= 5;
        int n= 7;

        for(int i=-2; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==i||((i==-2 ||i==6)&& j%4!=0) || ((i==-1 ||i==5)&& j%4==0))
                 System.out.print("* ");
                else
                 System.out.print("  "); 
            }
            System.out.println();
        }
    }
}
