import java.util.*;

public class ContainsDupII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                set.remove(nums[i - k - 1]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDupII m = new ContainsDupII();
        int[] arr = new int[] { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        System.out.println(m.containsNearbyDuplicate(arr, k));
    }
}
