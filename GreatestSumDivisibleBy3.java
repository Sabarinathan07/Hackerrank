class Solution {
    public int maxSumDivThree(int[] nums) {
        int res = 0, leftOne = 20000, leftTwo = 20000;
        for(int n:nums){
            res+=n;
            if(n%3==1){
                leftTwo = Math.min(leftTwo,leftOne+n);
                leftOne = Math.min(leftOne,n);
            }
            if(n%3==2) {
                leftOne = Math.min(leftOne,leftTwo+n);
                leftTwo = Math.min(leftTwo,n);
            }
        }
        if(res%3==0) return res;
        if(res%3==1) return res-leftOne;
        return res - leftTwo;
        
    }

}
