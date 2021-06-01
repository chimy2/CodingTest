package brute_force_search;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int w=0;
        int h=3;
        for(;h<brown/2;h++) {
            w=(brown+yellow)/h;
            if((w-1)*2+(h-1)*2==brown && brown+yellow==w*h) break;
        }
        return new int[]{w, h};
    }
}
