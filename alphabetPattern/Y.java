public class Y{
    public static void main(String[] args){
        int c= 7;
        int r= 7;

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                if((i==j ||i+j==(7-1)) && i<(7/2+1) || (j==7/2 && i>7/2))
                 System.out.print("* ");
                else
                 System.out.print("  "); 
            }
            System.out.println();
        } 
    }
}