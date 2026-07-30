class Solution {
    public boolean detectCapitalUse(String word) {
        int wl = word.length();
        int uppercase=0;
        for(int i=0;i<wl;i++){
            if(Character.isUpperCase(word.charAt(i))){
            uppercase++;
            }
        }
        return uppercase==wl || uppercase==0 || (uppercase==1 && Character.isUpperCase(word.charAt(0)));
    }
}