class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        int count = 0;  
        
        for (int start = 0; count < n; start++) {
            int current = start;
            int prevValue = nums[start];
            do {
                int nextIdx = (current + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prevValue;
                prevValue = temp;
                current = nextIdx;
                count++;
            } while (start != current);  
        }
    }
}
