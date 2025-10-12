// The first time, the bit is encountered, it is set in ones.
// The second time, it is set in twos and cleared from ones.
// The third time, it is cleared from both ones and twos.
class Solution {
    public int singleNumber(int[] nums) {
        //XOR property : a ^ a = 0 and a ^ 0 = a
        int ones = 0;
        int twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & (~twos);
            twos = (twos ^ num) & (~ones); 
        }
        return ones; //The remaining number will be single
    }
}
