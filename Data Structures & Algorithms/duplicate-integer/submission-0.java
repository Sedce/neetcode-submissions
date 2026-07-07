class Solution {
        public boolean hasDuplicate(int[] nums) {

        if(nums.length <= 1)
            return false;
        
        Set<Integer> dupes = new HashSet<>();
        int i=0;

        while(i < nums.length){
            if(dupes.add(nums[i]) == false)
                return true;
            i++;
        }
    return false;
    }
}