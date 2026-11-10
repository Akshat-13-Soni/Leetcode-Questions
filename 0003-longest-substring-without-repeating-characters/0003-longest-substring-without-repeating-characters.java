class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int start=0;
        int maxWindowLength=0;
        for(int end=0; end<s.length(); end++){
            char currentChar = s.charAt(end);
            if(hm.containsKey(currentChar)){
                start = Math.max(start, hm.get(currentChar)+1);
            }
            hm.put(currentChar, end);
            maxWindowLength = Math.max(maxWindowLength, end-start+1);
        }
        return maxWindowLength;
    }
}