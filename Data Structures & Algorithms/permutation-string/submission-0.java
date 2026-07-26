class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int reqlen = s1.length();

        while (right < s2.length()) {
            char ch = s2.charAt(right);

            if (!map.containsKey(ch)) {
                
                while (left < right) {
                    char leftchar = s2.charAt(left);
                    map.put(leftchar, map.get(leftchar) + 1);
                    reqlen++;
                    left++;
                }
                left = right + 1; 
                right++;
            } else if (map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
                reqlen--;
                right++;
                if (reqlen == 0)
                    return true;
            } else {
                
                while (left < right) {
                    char leftchar = s2.charAt(left);
                    map.put(leftchar, map.get(leftchar) + 1);
                    reqlen++;
                    left++;
                    if (leftchar == ch)
                        break;
                }
            }
        }
        return false;
    }
}
