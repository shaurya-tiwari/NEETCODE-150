
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diffrence = target - nums[i];
            if (map.containsKey(diffrence)) {
                return new int[] { map.get(diffrence), i }; // return the indices of the two numbers that add up to the
                                                            // target.

            }
            map.put(nums[i], i); // If the difference is not present in the map, then put the current number and
            // its index

        }
        return new int[] {}; // If no two numbers add up to the target, return null.
    }
}
