class Solution {
    public int minInsertions(String s) {
        int openBracket=0, result=0;
        int i=0, n=s.length();
        while(i<n){
            if(s.charAt(i)=='('){
                openBracket++;
            }
            else{
                if(i+1<n && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    result++;
                }
                if(openBracket>0){
                    openBracket--;
                }
                else{
                    result++;
                }
            }
            i++;
        }
        return result+(openBracket*2);
    }
}