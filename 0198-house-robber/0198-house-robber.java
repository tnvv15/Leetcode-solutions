class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int k=ans(nums,nums.length-1,dp);
        return k;
    }
    public int ans(int[] nums,int n,int[] dp){
        if(n==0)return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+ans(nums,n-2,dp);
        int npick=0+ans(nums,n-1,dp);
        return dp[n]=Math.max(pick,npick);
    }
}