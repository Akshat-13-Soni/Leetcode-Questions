class Solution{
    public String reformat(String s){
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c))
                letters.add(c);
            else if(Character.isDigit(c))
                digits.add(c);
        }

        if(letters.size() != digits.size() && Math.abs(letters.size() - digits.size()) > 1)
            return "";

        String longer = letters.size() > digits.size() ? "letters" : "digits";
        String shorter = letters.size() > digits.size() ? "digits" : "letters";

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < Math.min(letters.size(), digits.size()))
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
            i++;
        }

        if(longer.equals("letters") && i < letters.size())
            sb.append(letters.get(i));
        else if(longer.equals("digits") && i < digits.size())
            sb.append(digits.get(i));

        return sb.toString();
    }
}