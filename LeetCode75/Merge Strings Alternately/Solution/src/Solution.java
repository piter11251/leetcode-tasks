public class Solution {
    public String mergeAlternately(String word1, String word2){
        StringBuilder newString = new StringBuilder();
        int i=0,j=0;
        while(true){
            if(i<word1.length() && j<word2.length()){
                newString.append(word1.charAt(i));
                newString.append(word2.charAt(j));
                i++;
                j++;
            }
            else if(i==word1.length() && j<word2.length()){
                newString.append(word2.charAt(j));
                j++;
            }
            else if(i<word1.length() && j==word2.length()) {
                newString.append(word1.charAt(i));
                i++;
            }
            else{
                break;
            }
        }
        String result = newString.toString();
        return result;
    }
}
