class SuperDigit {

    public static long digitAdd(long z) {

        if (z <= 9) {
            return z;
        } else {

            long sum = 0;
            long rem = 0;
            while (z > 0) {
                rem = z % 10;
                sum = sum + rem;
                z = z / 10;;
            }
            return digitAdd(sum);
        }

    }

    public static int superDigitt(String n, int k) {
        
        String str = "";
        for (int i = 0; i < k; i++) {
            str = str + n;
        }

        int x = (int) digitAdd(Long.parseLong(str));
            return x;
    }

    public static void main(String args[]) {  
        System.out.println(  superDigitt("9875", 4));
    }
}
