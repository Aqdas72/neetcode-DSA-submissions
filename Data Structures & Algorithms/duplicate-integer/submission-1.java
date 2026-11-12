class Solution {
    public boolean hasDuplicate(int[] nums) {
        //nums
        //return t/f
        //if more than once 
        /*Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int e:nums){
            map.put(e,map.getOrDefault(e, 0)+1);
        }
        for(int key:map.get()){
            int val = map.get(key);
            if(val>key){
                return true;
            }
        }
        return false;*/
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}