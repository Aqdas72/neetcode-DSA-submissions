class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force approach --> O(n2)
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};*/

        //BETTER APPROACH  --> O(n) PROBLEM --> NOT APPLICABLE ON -VE NUM
        /*int i=0;
        int n=nums.length;
        int j=n-1;
        int sum = 0;
        while(j<n){
            sum = nums[i] + nums[j]; //-6
            if(sum>target){ // -6>-8 --> true
                j--;
            } else if(sum<target){
                i++;
            } else if(sum == target){
                return new int[]{i,j};
            }
        }
        return new int[]{};*/

        //OPTIMAL APPROACH
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
