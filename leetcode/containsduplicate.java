
/*
https://leetcode.com/problems/contains-duplicate/
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            if(!set.add(i)) return true;
        }
        return false;
    }
}