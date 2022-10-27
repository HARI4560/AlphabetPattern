public class Z{
    public static void main(String[] args){
        int c= 6;
        int r= 6;

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                if(i==0|| i==c-1 || j==5-i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}