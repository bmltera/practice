// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: nums){
            list.add(i);
        }
        Collections.sort(list);
        
        for(int i = 0; i < nums.length; i++){
            answer[i] = list.indexOf(nums[i]);
        }
        
        return answer;
        
    }
}