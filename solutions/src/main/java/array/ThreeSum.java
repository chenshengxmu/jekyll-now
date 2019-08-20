package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            if (nums[i] > 0)
            {
                return res;
            }
            int low = i + 1;
            int high = nums.length -1;
            while (low < high)
            {
                if (nums[i] + nums[low] + nums[high] == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    while (low < high && nums[low] == nums[low+1])
                    {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high-1])
                    {
                        high--;
                    }
                    low++;
                    high--;
                }
                else if (nums[i] + nums[low] + nums[high] < 0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }

        }

        return res;
    }
}
