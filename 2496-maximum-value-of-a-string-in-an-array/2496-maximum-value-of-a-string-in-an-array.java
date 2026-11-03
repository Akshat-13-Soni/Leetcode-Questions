class Solution {
    public int maximumValue(String[] strs) {
        int digitValue=0;
        int maxDigitValue=0;
        int stringLengthValue=0;
        int maxStringLengthValue=0;
        int maxArrayValue=0;
        for(int i=0; i<strs.length; i++){
            if(strs[i].matches("[0-9]+")){
                digitValue = Integer.parseInt(strs[i]);
                maxDigitValue = Math.max(maxDigitValue, digitValue);
            }
            else{
                stringLengthValue = strs[i].length();
                maxStringLengthValue = Math.max(maxStringLengthValue, stringLengthValue);
            }
        }
        maxArrayValue = Math.max(maxDigitValue, maxStringLengthValue);
        return maxArrayValue;
    }
}