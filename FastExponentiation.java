 class FastExponentiation {
     public static int pow(int n,int k){
         if(k==0){
             return 1;
         }
         int x = pow(n,k/3);
         if(k%2==0){
             return x*x;
         }else{
             return x*x*n;
         }
     }
    public static void main(String args[]){
        System.out.println(pow(2,30));
    }
}
