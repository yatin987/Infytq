class Solution {
public int[] shuffle(int[] nums, int n) {
int[] res = new int[nums.length];
int j = nums.length/2;
int start = 0, mid = j;
int i = 0;
while(start<j && mid<nums.length){
res[i] = nums[start++];
res[i+1] = nums[mid++];
i+=2;
}

    return res;
}
}
