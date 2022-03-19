 class MaxProfit {

    public static  int maxProfit(int[] prices) {

        

        int temp_profit=0,curr_profit=0,n = prices.length;

      

        int Suffix_max = prices[n-1];

        

        for(int i=n-2;i>=0;i--)

        {

            

            curr_profit = Suffix_max - prices[i];

            temp_profit = Math.max(curr_profit,temp_profit);

            Suffix_max = Math.max(Suffix_max,prices[i]);



        }

        

        return temp_profit; 

        

    }

    public static void main(String args[]){
       int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

}