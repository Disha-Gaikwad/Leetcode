//Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;  
    }

    boolean even(int num){                //Checks if the number of digits in a number are even
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
          return true;
        }
        return false;
    }
    int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1 ;    //Math.log10() + 1 returns the number of digits in a number 
}
}
