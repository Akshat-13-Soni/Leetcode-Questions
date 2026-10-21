class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)>s.charAt(i+1)){
                sorted=false;
                break;
            }
        }
        if(sorted){
            return 0;
        }
        if(n==2){
            return -1;
        }

        char min = 'z', max = 'a';                  //we set min as 'z' so ar Math.min(min, ch) it gets replaced by the character as 
                                                    //every character <=z and same for max as 'a'.
        for(int i=0; i<n; i++){
            min = (char) Math.min(min, s.charAt(i));
            max = (char) Math.max(max, s.charAt(i));
        }
        if(s.charAt(0)==min || s.charAt(n-1)==max){
            return 1;
        }

        boolean strictlyMin = true, strictlyMax = true;
        for(int i=1; i<n; i++){
            if(s.charAt(i)>=s.charAt(0)){
                strictlyMax = false;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) <= s.charAt(n - 1)){
                strictlyMin = false;
            }
        }
        if(strictlyMin && strictlyMax){
            return 3;
        }
        return 2;
    }
}