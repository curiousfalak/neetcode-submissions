class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();

        for(int i:nums)
           {
             if(hs.contains(i))
                return true;
               hs.add(i); 
           }

           return false;
    }
}