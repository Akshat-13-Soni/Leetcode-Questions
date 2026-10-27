class Solution {
    private int vowelCount(String s){
        int countVowel = 0;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                countVowel++;
            }
        }
        return countVowel;
    }
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        if(vowelCount(a)==vowelCount(b)){
            return true;
        }
        else{
            return false;
        }
    }
}