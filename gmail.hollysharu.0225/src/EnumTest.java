



enum MultiMedia{
	//0  1  2   3 
	None, Text, Video, Audio
}

public class EnumTest {

	public static void main(String[] args) {
		
		//MultiMedia 타입으로 변수를 선언하고 값을 할당 
		//MultiMedia에 설정된 값만 대입이 가능 
		MultiMedia m=MultiMedia.Audio; 
		System.out.println(m);
		
		//enum의 인덱스 리턴 (0부터 시작)
		System.out.println(m.ordinal());
		
		
	}
}
