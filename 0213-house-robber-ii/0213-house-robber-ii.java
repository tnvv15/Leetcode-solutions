class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int a=ans(nums,n-2,0,dp);
        Arrays.fill(dp,-1);
        int b=ans(nums,n-1,1,dp);
        return Math.max(a,b);
    }
    public int ans(int[] nums,int n,int start,int[] dp){
        if(n<start) return 0;
        if(n==start) return nums[n];
        if(dp[n]!=-1) return dp[n];
        int p=nums[n]+ans(nums,n-2,start,dp);
        int np=0+ans(nums,n-1,start,dp);
        return dp[n]=Math.max(p,np);
    }
}