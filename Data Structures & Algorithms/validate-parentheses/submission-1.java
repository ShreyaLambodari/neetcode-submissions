class Solution {
    public boolean isValid(String s) {
        Deque<Character> s1 = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                s1.push(s.charAt(i));
            } else {
                if (s1.isEmpty()) {
                    return false;
                } else {
                    char top = s1.pop();
                    if (s.charAt(i) == ')' && top != '(' || s.charAt(i) == ']' && top != '['
                        || s.charAt(i) == '}' && top != '{') {
                        return false;
                    }
                }
            }
        }
        return s1.isEmpty();
    }
}
