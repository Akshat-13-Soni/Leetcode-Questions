class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int moves=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                if(count>0){
                    count--;
                }
                else if(count==0){
                    moves++;
                }
            }
        }
        moves+=count;
        return moves;
    }
}