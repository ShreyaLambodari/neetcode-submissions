class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            sb = sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> l1 = new ArrayList<>();
        int n = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                n = n * 10 + (ch - '0');

            } else if (ch == '#') {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    i++;
                    sb.append(str.charAt(i));
                }
                l1.add(sb.toString());

                n = 0;
            }
            
        }
        return l1;
    }
}
