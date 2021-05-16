package dev_matching_web_backend_developer_firsthalf2021;

import java.util.Arrays;

public class LottosTopandBottomRankings {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win=0;
        int zero=0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0, j=0;i<lottos.length&&j<win_nums.length;) {
            if(lottos[i]==0) {
                zero++;
                i++;
            } else if(lottos[i]==win_nums[j]) {
                win++;
                i++;
                j++;
            } else if(lottos[i]<win_nums[j]) {
                i++;
            } else {
                j++;
            }
        }
        answer[0]=win+zero>1? 7-win-zero : 6;
        answer[1]=win>1? 7-win : 6;
        return answer;
    }
}
