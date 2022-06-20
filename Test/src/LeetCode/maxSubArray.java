package LeetCode;

public class maxSubArray {

    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));

    }
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSub = nums[0];
        int curSum = 0;

        int i = 0;
        while(i < n) {
            if  (curSum < 0) {
                curSum = 0;
            }
            curSum  = curSum + nums[i];
            maxSub = Math.max(maxSub, curSum);
            i++;
        }

        return maxSub;
    }
}
