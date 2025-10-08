class Solution {
    public int maximumWealth(int[][] accounts) {
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            //when you start a new col, take a new sum of that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            //now we have sum of one person
            //check with others
            if(sum > ans){
            ans = sum;
        }
        }
        return ans;
    }
}
