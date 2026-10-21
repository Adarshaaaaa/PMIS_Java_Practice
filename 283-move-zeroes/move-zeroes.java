class Solution {
    public void moveZeroes(int[] nums) {
         int j=0;
       int []lengthh=new  int[nums.length];
       
        for(int i=0;i<nums.length;i++){
           // int j=0;
            if(nums[i]!=0){
                
                lengthh[j]=nums[i];
                j++;
            }
             
        
    }
    for (int k = 0; k < nums.length; k++) {
            nums[k] = lengthh[k];
        }
}
}