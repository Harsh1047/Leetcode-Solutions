class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int y = stack.pop();
                int x = stack.pop();
                switch (tokens[i]){
                    case "+":
                        stack.push(x+y);
                        break;
                    case "-":
                        stack.push(x-y);
                        break;
                    case "*":
                        stack.push(x*y);
                        break;
                    case "/":
                        stack.push(x/y);
                        break;
                }
            }
            else stack.push(Integer.parseInt(tokens[i]));
        }
            return stack.pop();
    }
}