import java.util.ArrayList;
import java.util.Comparator;

public class Practice {

	public static void main(String[] args) {

		
		String str = "EROS";
/*		int size = str.length();

		while(true) {
			int idx = 0;
			try {
				Thread.sleep(1000);
				//글자 수만큼 글자를 가져오기 위한 반복문 
				for(int i=0; i<size; i=i+1) {
					//idx가 1회전마다 1씩 증가하기 때문에 한 칸씩 오른쪽에서 시작해서 글자 수 만큼을 가져옴
					//글자 수 만큼으로 나머지를 구하기 때문에 마지막 글자에 도달하면 첫 번째 글자부터 다시 가져옴  
					char ch = str.charAt((idx+i)%size);
					System.out.printf("%c", ch);
				}
				System.out.printf("\n");
				idx = idx +1; 
			}catch(Exception e) {}
			
		}
	
		
		//anagram.charAt(i);
		//System.out.printf("%s", anagram.charAt(i));

		for(int i=0; i<4; i=i+1) {
			for(int j=0; j<i; j=j+1) {
				try {
					Thread.sleep(1000);
					System.out.printf("%s", str.charAt(j));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.printf("\n");
		}
*/	
		
		
		//3월 첫째 주 
		//1.정수를 입력 받아서 동일한 내용의 문자열로 변경하고 
		//문자열을 정수로 변경하도록 작성하시오 
		//정수를 문자열로 변경하는 메소드나 문자열을 정수로 변경하는 메소드 사용불가 
		//charAt(), length(), 문자열 더하기는 +만 이용 
		//계산기같은..!
		//1234 -> "1234" 
		//"1234" -> 1234 
		
		
		//2. 정수 배열에 중복된 모든 데이터를 출력하시오 
		//int [] ar = {10, 30, 20, 20, 10, 30, 50, 40}; 
		//출력: 10, 20, 30 
		//1) Set을 이용해서 해결 
		//2) 다른 배열을 하나 생성해서 비교하는 방법으로 해결 - 실기문제라면 두 번째로 해결해야 함 
		
		
		int [] ar = {19, 37, 27, 40, 10};
		//28에서 가장 가까운 수 찾기 
		//비교해서 차이를 구한 뒤 문자로 바꾼 걸 비교...  
		
		//차이의 최소값을 저장할 변수 - 값의 범위를 모를 때는 배열의 첫 번째 데이터로 초기화 
		int min = ar[0];
		//차이의 최소값을 갖는 데이터를 저장할 변수 
		int data = ar[0];
		
		//배열의 데이터를 전체 순회
		for(int temp : ar) {
			//28과의 차이 구하기 
			int cha = temp - 28; 
			//차이가 음수이면 양수로 변경 
			if(cha < 0) {
				cha = cha * -1;
			}
			//최소값을 구할 때는 기존 최소값과 데이터를 비교해서 
			//데이터가 기존 최소값보다 작으면 최소값에 데이터를 대입 
			if(min > cha) {
				//차이의 최소값
				min = cha;
				//차이가 최소값이 될 때의 데이터를 data에 대입 
				data = temp;
			}
		}
		System.out.printf("28에 가장 가까운 데이터: %d\n", data);
		
		
		//3. 다음 문자 배열이 IP주소인지 확인하기
		String [] ip = {"13", "234", "212", "222"};
		//IPv4의 주소는 0.0.0.0 - 255.255.255.255 까지 
		//0-255 범위 내의 숫자인지 확인 
		
		
		
		
	}

}
