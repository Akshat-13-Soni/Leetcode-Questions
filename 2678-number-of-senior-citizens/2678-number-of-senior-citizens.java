class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count = 0;
        int age=0;
        for(int i=0; i<n; i++){
            age = ((details[i].charAt(11) - '0')*10+(details[i].charAt(12) - '0'));  //-'0' to convert '7' from char value to int value, other '7' it will give ASCII value that is 55.
            if(age>60){
                count++;
            }
        }
        return count;
    }
}