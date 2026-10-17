class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int totalSum = 0;
        for (String str : operations) {
            if (str.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } 
            else if (str.equals("D")) {
                list.add(2 * list.get(list.size() - 1));
            } 
            else if (str.equals("C")) {
                list.remove(list.size() - 1);
            } 
            else {
                list.add(Integer.parseInt(str));
            }
        }
        for (int score : list) {
            totalSum += score;
        }
        return totalSum;
    }
}