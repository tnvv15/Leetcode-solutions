class Solution {
    public long countCommas(long n) {
        long c=0;
        long s=1000;
        long cm=1;
        while(s<=n){
            long e=Math.min(n,s*1000-1);
            c+=(e-s+1)*cm;
            s*=1000;
            cm++;
        }
        return c;
    }
}