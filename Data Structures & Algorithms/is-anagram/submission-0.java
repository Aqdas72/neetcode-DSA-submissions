class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char st:s.toCharArray()){
            map.put(st,map.getOrDefault(st, 0)+1);
        }

        for(char tr:t.toCharArray()){
            if(!map.containsKey(tr)){
                return false;
            }

            int count = map.get(tr) - 1;

            if(count == 0){
                map.remove(tr);
            }else{
                map.put(tr,count);
            }
        }
        return map.isEmpty();

        /*Set<Character> set = new HashSet<>();
        for(char st:s.toCharArray()){
            set.add(st);
        }

        for(char tr:t.toCharArray()){
            if(!set.contains(tr)){
                return false;
            }
        }
        return true;//set --> can't know how many times a char appears*/
    }
}
