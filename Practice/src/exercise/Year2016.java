package exercise;

import java.time.LocalDate;

public class Year2016 {
    public String solution(int a, int b) {
        return LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
    }
}
