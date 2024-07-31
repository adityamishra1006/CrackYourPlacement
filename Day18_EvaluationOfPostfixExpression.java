 //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            int ascii = (int) ch;
            
            if(ascii >= 48 && ascii <= 57){
                stack.push(ascii - 48);
            } else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch(ch) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.peek();
    }
