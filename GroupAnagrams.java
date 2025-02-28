import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        // finding key of aal teh string .
        for (String string : strs) {
            int[] count = new int[26];
            // making string to character array .
            for (char c : string.toCharArray()) {
                count[c - 'a']++; // count stat from a .
            }
            // now again create all the characters to string .
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(string);
        }
        return new ArrayList<>(map.values());
    }
}
