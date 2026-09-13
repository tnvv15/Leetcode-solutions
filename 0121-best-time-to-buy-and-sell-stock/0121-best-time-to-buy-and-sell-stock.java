class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int mp=0;
        for(int i=1;i<prices.length;i++){
            curr=Math.min(curr,prices[i]);
            int p=prices[i]-curr;
            mp=Math.max(mp,p);
        }
        return mp;
    }
}