class Solution {
    public String reverseWords(String s) {
        String[] sub = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for(int i = sub.length - 1; i>=0; i--){
            reversed.append(sub[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
