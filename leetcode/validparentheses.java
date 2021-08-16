/*
https://leetcode.com/problems/valid-parentheses/
runtime: O^n
*/
class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter == '(' || letter == '{' || letter == '['){
                stack.add(letter);
            }
            else if(stack.isEmpty()) return false;
            else if(stack.peek() == map.get(letter)){
                stack.pop();
            }
            else
                return false;
        }
        if(!stack.isEmpty())
            return false;
        
        return true;
        
        
    }
}