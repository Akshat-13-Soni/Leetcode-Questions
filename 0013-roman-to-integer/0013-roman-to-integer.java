class Solution {
    public int romanToInt(String s) {
        int current=0;
        int next=0;
        int result=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=0; i<s.length()-1; i++){
            current = map.get(s.charAt(i));
            next = map.get(s.charAt(i+1));
            if(current<next){
                result-=current;
            }
            else{
                result+=current;
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}