public class X{
    public static void main(String[] args){
        int c= 7;
        int r= 7;

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                if(j==i|| j==(6-i))
                 System.out.print("* ");
                else
                 System.out.print("  "); 
            }
            System.out.println();
        }
    }
}