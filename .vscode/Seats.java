class Seats {
    public static int maxDistToClosest(int[] seats) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<seats.length;i++){
            if(seats[i]==0){
                count++;
            } else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        
        int count1 = 0;
        for(int i = 0;i<seats.length;i++){
            if(seats[i]==0){
                count1++;
            } else {
                break;
            }
        }
        int count2 = 0;
        for(int i =seats.length-1;i>=0;i--){
            if(seats[i]==0){
                count2++;
            }else {
                break;
            }
        }
       int max2 = Math.max(count1,count2);
       max2 = Math.max((max+1)/2,max2);
        return max2;
    }
    
    public static void main(String args[]){
        int [][]seats = {{1,2},{2,4}};
        Arrays.sort(seats)
    }
}
