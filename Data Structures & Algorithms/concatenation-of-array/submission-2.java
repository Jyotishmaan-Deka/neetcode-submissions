class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[2*n];
        for(int i = 0 ;i<2*n ; i++){
            if(i<n){
                newNums[i]= nums[i];
            }else{
                newNums[i]=nums[i-n];
            }
        }

        return newNums;
    }
}