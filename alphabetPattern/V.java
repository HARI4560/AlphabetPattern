public class V{
    public static void main(String[] args){
        int c= 7;
        int r= 14;

        for(int i=0; i<=c; i++){
            for(int j=0; j<=r; j++){
                if(i==j|| i+j==c*2)
                 System.out.print("*");
                else
                 System.out.print(" "); 
            }
            System.out.println();
        }
    }
}