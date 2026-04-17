class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque();

        for (char c : s.toCharArray()){
            if( c == ')' || c == '}' || c ==']'){
                //start popping
                if (stack.isEmpty()) return false;
                else if (c == ')'){
                    if ('(' != stack.pop()) {return false;}
                }
                else if (c == '}'){
                    if ('{' != stack.pop()) {return false;}
                }
                else if (c == ']'){
                    if ('[' != stack.pop()) {return false;}
                }
            }
            else{
                // add to the stack
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
