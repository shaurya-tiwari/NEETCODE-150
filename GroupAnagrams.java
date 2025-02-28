import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        // finding key of aal teh string .
        for (String inputstr : strs) {
            // convert string to the characters array
            char[] charaarray = inputstr.toCharArray();
            // sort the characters array
            Arrays.sort(charaarray);
            // construct string of the characters value
            String soretedstring = String.valueOf(charaarray);
            if (!map.containsKey(soretedstring)) {// of not available
                map.put(soretedstring, new ArrayList<>()); // empty list

            }
            // add string to the list .with the original itrated string .
            map.get(soretedstring).add(inputstr);
        }
        return new ArrayList<>(map.values());
    }
}