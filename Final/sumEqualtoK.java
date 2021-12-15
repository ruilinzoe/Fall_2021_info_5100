package Final;

import java.util.ArrayList;
import java.util.Arrays;

public class sumEqualtoK {
    public static int sumEqualtoK(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static void main (String[] args)
    {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(sumEqualtoK(arr,k));
    }

}
