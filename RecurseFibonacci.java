 class RecurseFibonacci {


    public static long fibonacci(long num){
        if(num==1||num==2){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
   public static void main(String args[]){
    for(long i=1; i<=5; i++){ 
        System.out.print(fibonacci(i) +" "); 
      }
      System.out.println();   } 
}
