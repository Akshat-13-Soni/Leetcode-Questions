class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st.push(sb);

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(new StringBuilder());
            }
            else if(ch == ')'){
                StringBuilder sb2 = st.pop();
                String temp = sb2.reverse().toString();
                st.peek().append(temp);
            }
            else{
                if(Character.isLetter(ch)){
                    st.peek().append(ch);
                }
            }
        }
        return st.peek().toString();
    }
}