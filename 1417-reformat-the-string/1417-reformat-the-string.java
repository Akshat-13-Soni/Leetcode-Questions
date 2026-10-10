class Solution{
    public String reformat(String s){
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c)){
                letters.add(c);
            }
            else{
                digits.add(c);
            }
        }
        if(Math.abs(letters.size() - digits.size()) > 1){
            return "";
        }
        String longer = letters.size() > digits.size() ? "letters" : "digits";
        StringBuilder sb = new StringBuilder();
        int i;
        for(i=0; i< Math.min(letters.size(), digits.size()); i++)
        {
            if(longer.equals("letters"))
            {
                sb.append(letters.get(i));
                sb.append(digits.get(i));
            }
            else
            {
                sb.append(digits.get(i));
                sb.append(letters.get(i));
            }
        }
        if(longer.equals("letters") && i < letters.size())
            sb.append(letters.get(i));
        else if(longer.equals("digits") && i < digits.size())
            sb.append(digits.get(i));
        return sb.toString();
    }
}