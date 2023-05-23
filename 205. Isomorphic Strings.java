class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (i == 0) {
                hm.put(sc, tc);
            }
            else {
                if (hm.containsKey(sc)) {
                    if (hm.get(sc) != tc) {
                        return false;
                    }
                }
                else if (hm.containsValue(tc)) {
                    return false;
                }
            }
            hm.put(sc, tc);
        }
        return true;
    }
}
