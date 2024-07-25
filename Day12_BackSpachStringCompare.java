class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != '#'){
                sStack.push(c);
            } else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }

        for(char c : t.toCharArray()){
            if(c != '#'){
                tStack.push(c);
            } else if(!tStack.isEmpty()){
                tStack.pop();
            }
        }

        while(!sStack.isEmpty() && !tStack.isEmpty()){
            if(sStack.pop() != tStack.pop()) return false;
        }
        return tStack.isEmpty() && sStack.isEmpty();

        
    }
}
