// https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        for(int i = 0; i < accounts.length; i++){
            int person = 0;
            for(int j = 0; j < accounts[i].length; j++){
                person += accounts[i][j];
            }
            answer = Math.max(person,answer);
        }
        return answer;
    }
}