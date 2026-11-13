class Solution {
    public int removeDuplicates(int[] nums) {
        //remove duplicates from nums --> in place
        //return no. of unique elements
        //nums --> [1,1,2,3,4]
        //APPROACH --> nested loop O(n2)
        //         --> sliding window
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}