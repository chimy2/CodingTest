package exercise;

//	호텔 대실
public class HotelRoomRental {

    public int solution(String[][] book_time) {
        int answer = 0;

        int[] size = new int[2500];

        for (String[] time : book_time) {
            int in = Integer.parseInt(time[0].replace(":", ""));
            int out = Integer.parseInt(time[1].replace(":", "")) + 10;
            size[in]++;
            size[out % 100 >= 60 ? ((out / 100 + 1) * 100 + out % 100 % 60) : out]--;
        }

        int count = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int temp = size[i * 100 + j];
                if (temp != 0) {
                    count += temp;
                    answer = Math.max(count, answer);
                }
            }
        }

        return answer;
    }
}