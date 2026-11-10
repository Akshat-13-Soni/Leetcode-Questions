class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        String[] s1 = new String[numRows];
        for(int i=0; i<numRows; i++){
            s1[i]="";
        }
        int i=0;
        while(i<n){
            for(int index=0; index<numRows && i<n; index++){
                s1[index]+=s.charAt(i++);
            }
            for(int index=numRows-2; index>0 && i<n; index--){
                s1[index]+=s.charAt(i++);
            }
        }
        String res="";
        for(String str:s1){
            res+=str;
        }
        return res;
    }
}