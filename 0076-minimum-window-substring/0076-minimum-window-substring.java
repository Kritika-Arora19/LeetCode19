class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        for (int i = 0; i < t.length(); i++)
            hash[t.charAt(i)] += 1;
        int l = 0, r = 0, sIndex = -1, minlen = Integer.MAX_VALUE, count = 0;
        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0)
                count++;
            hash[s.charAt(r)] -= 1;

            while (count == t.length()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    sIndex = l;
                }
                 hash[s.charAt(l)] += 1;
                if (hash[s.charAt(l)] > 0)
                    count--;
                l++;
            }
            r++;
        }
        if (sIndex != -1)
            return s.substring(sIndex, sIndex + minlen);
        return "";
    }
}