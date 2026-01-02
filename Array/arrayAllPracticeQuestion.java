public class arrayAllPracticeQuestion {

    //Function to reverse an array
    public static void rev_Array(int numbers[]){
        int first = 0 , last = numbers.length -1 ;
        while (first < last) {
            int temp = numbers[last];
            numbers [last] = numbers [first];
            numbers [first] = temp;

            first ++;
            last --;
            
        }

    }

    //Function to print pairs of array
    
    public static void printPairs(int numbers[]){
        int tp = 0 ;
        System.out.println("pairs of array");
        for(int i = 0 ; i<numbers.length ; i++){
            int current = numbers[i];
            for(int j = i+1 ; j<numbers.length ; j++){
                System.out.print("("+ current + "," + numbers[j] + ")");
                tp++;
            }System.out.println();
        }
        System.out.println("total pairs : "+ tp);
    }

    //Function to print sub array 
    public static void print_Subarray(int numbers[]){
        int ts = 0;
        for(int i = 0 ; i<numbers.length ; i++){
           
            int start = i;
            for(int j = i ; j<numbers.length ; j++){
                int end = j ;
                for(int k = start ; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                    
                }ts++;
                System.out.println();
            }System.out.println();               
        }System.out.println("total subarrays = " + ts);

    }


    //function for max subarray sum by bruteforce
    public static void maxSubarraySum(int numbers[]){
        int currsum ;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            int start = i;
            for(int j=i; j<numbers.length ; j++){
                int end = j;
                currsum = 0;
                for(int k=start ; k<=end ; k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+ maxsum);
    }


    //Function to print max subarray sum by prifix
    public static void maxSubarrayprifix(int num []){
        int currsum ;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int [num.length];

        prefix[0] = num[0];

        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + num[i];

        }
        for(int i=0; i<num.length ; i++){
            int start = i;
            for(int j=i ; j<num.length ; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxsum <currsum){
                    maxsum = currsum;
                }
            }

        }
        System.out.println("max sum = " + maxsum);
    }


    //function for kadanes algorithm
    public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0 ; i<num.length ; i++){
            currsum = currsum + num[i];
            if(currsum<0){
                currsum = 0 ;
            }
            ms = Math.max(currsum, ms);
        }
        System.out.println("max sum by kadanes is = " + ms);
    }



    //Trapping rain water problem
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i=1]);
        }

        //calculate right max boundary - array
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i-- ){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i = 0 ; i<n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    //Buy Sell Stocks problem
    public static int buySellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i<price.length ; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];

            }

        }return maxProfit;

    }

    public static void main(String[] args) {
        // int numbers[] = {2,4,6,8,10};
        // System.out.println("Reverse of an array");
        // rev_Array(numbers);
        // for(int i = 0 ; i<numbers.length ; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();

        // System.out.println();
        // printPairs(numbers);

        // System.out.println();
        // System.out.println("Subarrays");
        // print_Subarray(numbers);

        // System.out.println();
        // //code for Buy Sell Stocks
        // int price[] = {7,1,5,3,6,4};
        // System.out.println("Maximum Profit for Buy and Sell Stock = " + buySellStocks(price));


        // //code for trapped rain water
        // int height [] = {4,2,0,6,3,2,5};
        // int trapp = trappedRainwater(height);
        // System.out.println(trapp);


        // //code for max subarray sum
        // maxSubarraySum(numbers);


        //code for max subarray sum by prifix
        int num[] = {1,-2,6,-1,3};
        maxSubarrayprifix(num);

        //code for kadanes
        kadanes(num);
    }
    
}
