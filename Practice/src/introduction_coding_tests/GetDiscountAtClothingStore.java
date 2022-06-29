package introduction_coding_tests;

public class GetDiscountAtClothingStore {
//	옷가게 할인 받기
	public int solution(int price) {
		int n = 100000;
		return (int) (price >= 5 * n ? price * 0.8 : price >= 3 * n ? price * 0.9 : price >= n ? price * 0.95 : price);
	}
}