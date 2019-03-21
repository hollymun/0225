
public class intToString {

	public static void main(String[] args) {
		//3월 첫째 주 
		//1.정수를 입력 받아서 동일한 내용의 문자열로 변경하고 
		//문자열을 정수로 변경하도록 작성하시오 
		//정수를 문자열로 변경하는 메소드나 문자열을 정수로 변경하는 메소드 사용불가 
		//charAt(), length(), 문자열 더하기는 +만 이용 
		//계산기같은..!
		//1234 -> "1234" 
		//"1234" -> 1234 

		// %10 : 10으로 나눈 나머지 4
		// /10 : 10으로 나눈 몫 123
		
		int su = 07625; //숫자 0 : 48
		String str = "";
		while(su != 0) {
			int nmg = su % 10; 
			str = nmg + str; 
			su = su / 10; 
		}
		System.out.println(str);
		
		for(int i=0; i<str.length(); i=i+1) {
			//가져온 것은 문자라서 48이 더해진 코드가 옴
			//숫자로 변경할 때는 48을 빼줘야 함 
			char ch = str.charAt(i);
			su = su * 10 + (ch-48);
		}
		
	System.out.println(su);
	}

}
