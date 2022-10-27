public class W{
    public static void main(String[] args){
        int c= 6;        
        int r= 7;

        for(int i=0; i<=c; i++){
            for(int j=0; j<=r; j++){
                if((j==1 ||(i==j-1 || i+j==r || j==r)&& i!=1 &&  i!=2)|| j==r)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}