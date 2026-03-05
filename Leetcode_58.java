//Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while(end >= 0 && s.charAt(end) == ' '){     //to skip trailing white spaces
            end--;
        }

        int start = end;
        while(start >=0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}
