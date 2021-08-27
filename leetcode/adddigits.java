// https://leetcode.com/problems/add-digits/submissions/
class Solution {
    
    public int addDigits(int num) {
        int answer = num;
        while(answer > 9){
            answer = 0;
            while(num > 0){
                int digit = num%10;
                answer += digit;
                num = (num - digit)/10;
            }
            num = answer;
            System.out.println(answer);
        }
        return answer;
    }
}