package blind_recruitment;

import java.time.LocalDate;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDate ld=LocalDate.of(2016, 4, 2);
        System.out.println(ld.getDayOfWeek().toString().substring(0,3));
	}
}
