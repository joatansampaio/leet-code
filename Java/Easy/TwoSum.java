import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] nums2 = { 3, 2, 4 };
        int[] nums3 = { 3, 3 };
        int target = 9;
        int target2 = 6;
        int target3 = 6;

        int[] result = twoSum(nums, target);
        int[] result2 = twoSum(nums2, target2);
        int[] result3 = twoSum(nums3, target3);

        for (int n : result)
            System.out.print(n + ", ");

        System.out.println();
        for (int n : result2)
            System.out.print(n + ", ");

        System.out.println();
        for (int n : result3)
            System.out.print(n + ", ");

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i]))
                return new int[] { hashmap.get(target - nums[i]) , i};
            hashmap.put(nums[i], i);
        }
        return null;
    }

}