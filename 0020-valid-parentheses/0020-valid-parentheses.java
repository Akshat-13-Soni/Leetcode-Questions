class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(hm.containsValue(ch)){
                st.push(ch);
            }
            else if(hm.containsKey(ch)){
                if(st.isEmpty() || hm.get(ch)!=st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}