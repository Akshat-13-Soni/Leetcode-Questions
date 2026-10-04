class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> bracketStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                bracketStack.push(i);
            }
            else if(s.charAt(i)=='*'){
                starStack.push(i);
            }
            else{                                         //')' case
                if(!bracketStack.isEmpty()){
                    bracketStack.pop();
                }
                else if(!starStack.isEmpty()){            //'*' behave as ')'
                    starStack.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!bracketStack.isEmpty() && !starStack.isEmpty()){
            if(bracketStack.pop()>starStack.pop()){                  // '(' is to the right of '*'
                return false;
            }
        }
        return bracketStack.isEmpty();
    }
}