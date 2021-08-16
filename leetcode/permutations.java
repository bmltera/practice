/*
https://leetcode.com/problems/permutations/
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        ArrayList<List<Integer>> refined = new ArrayList<>();
        if(nums.length == 1){
            ArrayList<Integer> one = new ArrayList<>();
            one.add(nums[0]); 
            refined.add(one);
            return refined;
        }
        if(nums.length == 2){
            ArrayList<Integer> one = new ArrayList<>();
            one.add(nums[0]); 
            one.add(nums[1]);
            ArrayList<Integer> two = new ArrayList<>();
            two.add(nums[1]); 
            two.add(nums[0]);
            refined.add(one); 
            refined.add(two);
            return refined;
        }
        
        HashSet<ArrayList<Integer>> answer = new HashSet<ArrayList<Integer>>();
        int size = nums.length;
        recurse(nums, 0, size, answer);
        
        return new ArrayList<>(answer);
    }
    
    public void recurse(int[] nums, int position, int size, HashSet<ArrayList<Integer>> answer){
        if(position == size){
            ArrayList<Integer> set = new ArrayList<Integer>();
            for(int i:nums){
                set.add(i);
            }
            answer.add(set);
            return;
        }
        
        for(int i = 0; i < size; i++){
            //swap
            int temp = nums[position];
            nums[position] = nums[i];
            nums[i] = temp;
            recurse(nums, position + 1, size, answer);            
        }
            ArrayList<Integer> set = new ArrayList<Integer>();
            for(int i:nums){
                set.add(i);
            }
            answer.add(set);
        
    }
}
