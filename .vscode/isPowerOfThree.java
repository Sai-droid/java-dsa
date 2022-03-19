 class isPowerOfThree {
    public static  int isPowerOfThree(int n) {
        if(n<=0) return 0;
        int counteven = 0;
        int countodd = 0;
        
        for(int i =0;i<32;i=i+2){
            if(((n>>i)&1)==1){
                counteven++;
            }
            
        }
          for(int i =1;i<32;i=i+2){
             
            if(((n>>i)&1)==1){
                countodd++;
            }
        }
        System.out.println(counteven+" "+countodd);
        return (Math.abs(counteven-countodd))%3 ;
    }
    public static void main(String args[]){
        System.out.println(isPowerOfThree(45));
    }
}
