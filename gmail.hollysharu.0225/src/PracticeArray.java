
public class PracticeArray {

	public static void main(String[] args) {

	
	String str="Hello";
	int length=str.length();		//i<str.length() 해도 되지만 반복문이 돌 때마다 힙에 찾아가니까 비효율
	//모두 대문자로 변경하고 싶을 때 
	//a:97 z:122 => a<=i  z>=i
	String upper=" ";
	for(int i=0; i<length; i=i+1) {
		char ch=str.charAt(i);
		if(ch>='a' && ch<='z') {
			//int단위로 연산되기 때문에 char에 들어가지 않으므로 강제형변환 
			char x= (char)(ch-32);
			upper=upper+x;
			}
		else {
			upper=upper+ch;
			}
		}
	//char 출력타입 %c
	//문자열 출력타입 %s
	System.out.printf("%s\n", upper);
	
	System.out.printf("======================\n");

	//개수 저장 변수 
	int cnt=0;
	String str2="boxyHaru"; 
	//대문자 소문자 숫자 특수문자  1개 이상이면 가능 
	//&& || 이용
	char ch=0;
	for(int i=0; i<length; i=i+1) {
		ch=str2.charAt(i);
	}
	if(ch>='A'&&ch<'Z'||ch>='a'&&ch<='z') {
		System.out.printf("입력완료\n");			
	}
	else {
		System.out.printf("대문자, 소문자 1개 이상 포함한 비밀번호를 입력하세요\n");
	}
	
	System.out.printf("======================\n");

	//비밀번호를 저장 변수 
	String password="boxyHaru1!";
	//문자열의 길이를 저장할 변수 
	int len=password.length();
	//대문자, 소문자 개수를 저장할 변수 
	int dae=0;
	int so=0;
	int su=0;
	int etc=0;
	
	//문자열 순회 
	for(int i=0; i<len; i=i+1) {
		char ch2=password.charAt(i);
	
		//대문자 확인 
		if(ch>='A'&&ch<'Z') {
			dae=dae+1;
		}
		else if(ch>='a'&&ch<='z') {
			so=so+1;
		}
		else if(ch>='0'&&ch<='9'){
			su=su+1;
		}
		else {
			etc=etc+1;
		}
	}
		
	if(dae>0 && so>0 && su>0 && etc>0) {
		System.out.printf("사용 가능한 비밀번호입니다\n");
	}
	else {
		System.out.printf("대문자, 소문자, 숫자, 특수문수가 1개 이상 포함한 비밀번호를 입력하세요\n");
	}
	
	
	
	System.out.printf("======================\n");
	
	int [] ar= {30,40,50,10,20};
	int size=ar.length;
	for(int i=0; i<size-1; i=i+1) {
		int flag=0;
		//-i+3 => 4-i => size-1-i 
		for(int j=0; j<size-1-i; j=j+1) {
			//본인(j)보다 다음 거가 더 클 때 위치변경 
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
		System.out.printf("%d\n", ar[0]);
		
	
	}
	
	
	
	}
}
