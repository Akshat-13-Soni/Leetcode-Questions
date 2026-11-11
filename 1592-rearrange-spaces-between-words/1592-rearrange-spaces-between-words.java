class Solution {
    public String reorderSpaces(String text) {
        int countSpaces=0;
        int countWords=0;
        boolean isWord=false;
        for(char ch:text.toCharArray()){
            if(ch==' '){
                countSpaces++;
                isWord=false;
            }
            else{
                if(!isWord){
                    countWords++;
                    isWord=true;
                }
            }
        }
        String[] words = text.trim().split("\\s+");

        int gap=(countWords==1)?0:countSpaces/(countWords-1);
        int extra=(countWords==1)?countSpaces:countSpaces%(countWords-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            sb.append(words[i]);
            if(i<words.length-1){
                sb.append(" ".repeat(gap));  //keep on goinf until gap value
            }
        }
        sb.append(" ".repeat(extra));
        return sb.toString();
    }
}