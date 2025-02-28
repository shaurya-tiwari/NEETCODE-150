import java.util.*;
class Solution {
	public boolean hasDuplicate(int[] nums) {
		HashSet<Integer> hasDuplicate = new HashSet<>();

		for (int num : nums) {
			if (hasDuplicate.contains(num))
				return true;
			hasDuplicate.add(num);
		}

		return false;
    }
	}