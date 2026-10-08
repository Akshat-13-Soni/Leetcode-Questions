class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String s1 = sb.toString();
        int low=0, high=s1.length()-1;
        for(int i=low; i<high; i++){
            while(low<=high){
                if(s1.charAt(low)!=s1.charAt(high)){
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
}