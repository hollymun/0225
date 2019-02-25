
public class StringSplit {

	public static void main(String[] args) {
		//Hello.java라는 문자열에서 확장자(.이후의 문자만 추출)만 추출하기
		//문자열에서 특정 기호나 위치 이후의 문자열을 가져오고자 하는 경우
		//split 메소드는 lastIndexOf와 substring 조합을 이용함
		//split은 입력한 기호를 기준으로 해서 문자열을 분할한 후 String 배열로 리턴하는 메소드 
		//lastIndexOf는 문자나 문자열을 뒤에서부터 찾아서 찾은 첫 번째 위치를 리턴
		//substring은 정수 1개 대입하면 정수 이후의 문자열을 리턴
		//정수 2개를 대입하면 첫 번째 정수 이후부터 
		//두 번째 정수 앞까지의 문자열을 리턴함 
		
		String filename="Hello.java";
		//split을 이용해서 java만 추출하기 
		//특수문자는 기호를 바로 사용하면 안 되고 \\를 붙여서 분할해야 하는 경우가 있음 
		String [] ar=filename.split("\\.");
		System.out.printf("%s\n", ar[ar.length-1]);
		
		//substring을 이용해서 java만 추출하기 
		int idx=filename.lastIndexOf('.');
		String ext=filename.substring(idx+1);
		System.out.printf("%s\n", ext);
		
		System.out.printf("======================\n");
		
		//StringBuilder 추가작업을 여분의 공간에 저장함 
		StringBuilder sb=new StringBuilder("Hello");
		System.out.printf("sb1:%d\n", sb.hashCode());
		System.out.printf("sb1:%s\n", sb);

		sb.append("StringBuilder");
		System.out.printf("sb2:%d\n", sb.hashCode());
		System.out.printf("sb2:%s\n", sb);
		//같은 곳에 저장돼서 같은 값의 해시코드 출력 

		String m=new String("Hello Builder");
		System.out.printf("m:%s\n", m);

		
	}

}
