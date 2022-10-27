public class U{
    public static void main(String[] args){
        int c =7;
        int r= 7;

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                if((j==0|| j==6) && i<5|| i-j==4|| i+j==10|| i*j==18)
                 System.out.print("* ");
                else
                 System.out.print("  "); 
            }
            System.out.println();
        }
    }
}