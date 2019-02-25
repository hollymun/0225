import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] intAr= {100,765,76,87,90,82};
		Arrays.sort(intAr);
		
		for(int sunsue:intAr) {
			System.out.printf("%d\t", sunsue);
		}
		System.out.printf("\n");

		String [] strAr= {"하루", "빡시", "얌마", "나루", "감자", "빵"};
		Arrays.sort(strAr);
		for(String sunsue:strAr) {
			System.out.printf("%s\t", sunsue);
		}
		System.out.printf("\n");
		
		
		
		
		
	}
}
