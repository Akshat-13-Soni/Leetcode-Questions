class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            boolean onlyDigits = true;
            for(int j=0; j<s.length(); j++){   //check for every character in string
                char ch = s.charAt(j);
                if(ch<'0'||ch>'9'){
                    onlyDigits=false;
                }
            }
            int value;
            if(onlyDigits){
                value = Integer.parseInt(s);     // "00123" -> 123
            }
            else{
                value = s.length();     // "abcd" -> length=4
            }
            if(value>maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}