class Solution {
    public String largestGoodInteger(String num) {
        char ch = '-';
        for(int i=2; i<num.length(); i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2) && num.charAt(i)>ch){
                ch = num.charAt(i);
            }
        }
        if(ch=='-'){
            return "";
        }
        else{
            return ""+ch+ch+ch;
        }
    }
}