package Find_Programming_Meister;

import java.util.Arrays;

public class Phonketmon {
    public int solution(int[] nums) {
        int answer = 1;
        int index = 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]) {
                index=i;
                answer++;
            }
        }
        return answer>nums.length/2?nums.length/2:answer;
    }
}
