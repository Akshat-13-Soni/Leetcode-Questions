class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0){                            //condition only satisfy for the inner ones
                    ans.append(ch);
                }
                depth++;                                //whenever find ( increment the counter
            }
            if(ch==')'){                                
                depth--;                                //firstly decrement the counter
                if(depth>0){                            //inner ones
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}