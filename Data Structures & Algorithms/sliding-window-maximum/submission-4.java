class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        int[] result = new int[nums.length - k + 1];

        for (int r = 0; r < nums.length; r++) {
            if (!dq.isEmpty() && dq.peekFirst() < r - k + 1) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.removeLast();
            }
            dq.addLast(r);
            if (r >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}
