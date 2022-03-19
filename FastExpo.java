class FastExpo {

    
    
        public static double pow(double x ,int n ){
            if (n == 0) {
                return (double)1;
            }
            double y =(double) pow(x, n / 2);
    
            if (n % 2 == 0) {
                return (double)y * y;
            } else {
                return(double) y * y * x;
            }
    
        }
         static double myPow(double x, int n) {
             if (n == 0) {
                return (double)1;
            }
            int k = Math.abs(n);
                double z = pow(x,k);
                
                // System.out.println(n);
                System.out.println(k);
            if(n<0){
                 return (double)1/z;
            } 
            return (double)z;
            }
          
        
        
  





    public static void main(String args[]) {
        System.out.println(myPow(2, -2));
        // System.out.println(MathPowerOfThree(2, 5));
    }
}


  // } static double MathPowerOfTwo(double x, int n) {

    //     if (n == 0) {
    //         return (double)1;
    //     }

    //     double y =(double) MathPowerOfTwo(x, n / 2);

    //     if (n % 2 == 0) {
    //         return (double)y * y;
    //     } else {
    //         return(double) y * y * x;
    //     }

    // }