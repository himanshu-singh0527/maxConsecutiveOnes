import java.util.*;

class Solution {
    public int maxConsecutiveOnes(int nums[]) {
        int maxCount = 0;
        int currentCount = 0;
        for (int x : nums) {
            if (x == 1) {
                currentCount++;
                if (maxCount < currentCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int maxConsecutiveOnes = solution.maxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }
}
