public class Solution {
    public static void main(String[] args) {
        int[] input={1,1,2,3,3,4,4,8,8};
    }
    public int singleNonDuplicate(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=result){
               return result;
            }
            else{
                result=nums[i];
            }
        }
        return result;
    }
}