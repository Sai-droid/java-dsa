 class ImplementPow {
    public static long powOfX(int x,int y){
        if(y<0){
            return 0;
        }
        if(y==0){
            return 1;
        }
        long ans = powOfX(x,y/2);
        if(y%2==0){
            return ans*ans;
        } else{
            return ans*ans*x;
        }
    }
public static  int pow(int x, int n, int d) {
   int temp = x;
   long ans = (long)powOfX(x,n);
   if(n%2==0 && x<0){
       return (int)ans%d;
   } 
   if(n%2!=0 && x<0){
    return 0;
   } else{
       return (int)ans%d;
   }
   
   
}
public static void main(String args[]){
    System.out.println(pow(2,3,3));
}
}
