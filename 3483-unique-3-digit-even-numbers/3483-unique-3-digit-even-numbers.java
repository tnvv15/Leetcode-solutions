class Solution {
    public int totalNumbers(int[] arr) {
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            for(int j=0;j<n;j++){
                if(j==i)continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j) continue;
                    if (arr[k] % 2 != 0) continue;
                    int digit=arr[i]*100+arr[j]*10+arr[k];
                    set.add(digit);
                }
            }
        }
        return set.size();
    }
}