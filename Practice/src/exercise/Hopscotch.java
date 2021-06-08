package exercise;

public class Hopscotch {
    int solution(int[][] land) {
        int answer = 0;
        int len=land.length;
        for(int i=1;i<len;i++) {
            for(int j=0;j<land[i].length;j++) {
                land[i][j]+=Math.max(land[i-1][(j+1)%4], Math.max(land[i-1][(j+2)%4], land[i-1][(j+3)%4]));
            }
        }
        return Math.max(Math.max(land[len-1][0], land[len-1][1]), Math.max(land[len-1][2], land[len-1][3]));
    }
}
