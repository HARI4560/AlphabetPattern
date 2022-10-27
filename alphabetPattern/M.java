class M{
    public static void main(String[] args){
        int c = 6;  
        int r = 7;

        for(int i=1; i<=c; i++){
            for(int j=1; j<=r; j++){
                if((j==1||(i==j||i+j==r+1||j==r) && i!=c-1 && i!=c )||(j==r)&& i!=c-2)
                 System.out.print("* ");
                else
                 System.out.print("  "); 
            }
            System.out.println();
        }
    }
}