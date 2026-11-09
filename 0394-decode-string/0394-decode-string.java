class Solution {
    private String decode(String s, int[] index){
        StringBuilder sb = new StringBuilder();
        int num=0;
        while(index[0]<s.length()){
            char ch = s.charAt(index[0]);
            if(Character.isDigit(ch)){
                //parse multidigit number
                num = num*10+(ch-'0');
                index[0]++;
            }
            else if(Character.isLetter(ch)){
                sb.append(ch);
                index[0]++;
            }
            else if(ch=='['){
                index[0]++;
                String inside = decode(s, index);  //Recurse
                //now append the inside string num times
                for(int i=0; i<num; i++){
                    sb.append(inside);
                }
                num=0; //Reset to 0
            }
            else{
                index[0]++;
                return sb.toString();
            }
        }
        return sb.toString();
    }
    public String decodeString(String s) {
        int[] index = {0};    //Initializing to 0
        return decode(s, index);
    }
}