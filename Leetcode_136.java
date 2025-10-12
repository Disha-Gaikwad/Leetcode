class Solution {
    public int singleNumber(int[] nums) {
        //XOR property : a ^ a = 0 and a ^ 0 = a
        int single = 0;
        for(int num : nums){
            single = single ^ num;   //XOR each number with single
        }
        return single;     //The remaining number will be single
    }
}        
