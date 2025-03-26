package search;
public class Solution {
    public static void main(String[] args) {
        int[] input={2,7,11,15};
        int target=9;
        int[] result=twoSum(input,target);
        System.out.println(java.util.Arrays.toString(result));
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] result={-1,-1};
        int sum=numbers[start]+numbers[end];
        while(start<end){
            if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                return result;
             }
            else if(sum<target){
                start++;
             }
            else{
                end--;
            }
        }
         return result;
    }
}