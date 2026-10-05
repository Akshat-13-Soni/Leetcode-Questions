class Solution {
    public String frequencySort(String s) {
        // Step 1: count frequency of each char
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // Step 2: repeatedly take the char with the max count
        StringBuilder sb = new StringBuilder();
        while (!hm.isEmpty()) {
            char maxCh = ' ';
            int maxCount = 0;
            for (Map.Entry<Character, Integer> e : hm.entrySet()) {
                if (e.getValue() > maxCount) {
                    maxCount = e.getValue();
                    maxCh = e.getKey();
                }
            }
            for (int i = 0; i < maxCount; i++) {
                sb.append(maxCh);        // place it maxCount times
            }
            hm.remove(maxCh);            // done with this char, move to the next max
        }
        return sb.toString();
    }
}