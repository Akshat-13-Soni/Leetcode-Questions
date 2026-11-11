class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        int sign = 1;      //1 for +ve & -1 for -ve
        int number=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }
            else if(ch=='+' || ch=='-'){
                result+=sign*number;
                number=0;                     //Reset for next upcoming operand
                sign = (ch=='+')? 1:-1;       //update sign value for next num
            }
            else if(ch=='('){
                st.push(result);
                st.push(sign);
                result=0;          //reset value of doing inner calculation
                sign=1;
            }
            else if(ch==')'){
                result+=sign*number;
                number=0;
                result*=st.pop();        //sign would pop first so *sign
                result+=st.pop();        //result stored would be poped so +result
            }
        }
        return result+sign*number;
    }
}