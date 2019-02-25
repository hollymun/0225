
public class StringFormat {

	public static void main(String[] args) {
		
		//String.format 메소드는 System.out.printf와 동일한 방법으로 사용
		//출력하지 않고 문자열로 리턴한다는 점이 다름 
		int x=100;
		int y=200;
		String msg=String.format("x:%d y:%d\n", x,y);
		System.out.printf("%s", msg);
		
		String str="Hello";
		int length=str.length();
		String dae="";
		for(int i=0; i<length; i=i+1) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				char temp=(char)(ch-32);
				dae=dae+temp;
			}
			else {
				dae=dae+ch;
			}
		}
		System.out.printf("대문자:%s\n", dae);
		
		String so="";
		for(int i=0; i<length; i=i+1) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				char temp=(char)(ch+32);
				so=so+temp;
			}
			else {
				so=so+ch;
			}
		}
		System.out.printf("소문자:%s\n",so);
		
		System.out.printf("======================\n");

		System.out.printf("대문자2:%s\n",dae);
		
		for(int i=0; i<length; i=i+1) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				char temp=(char)(ch-32);
				dae=String.format("%s%c", dae,temp);
			}
			else {
				dae=String.format("%s%c", dae,ch);
			}
		}
		System.out.printf("대문자2:%s\n",dae);
		
		System.out.printf("======================\n");
		
		//dae라는 문자열에서 E의 위치 확인 
		int idx=dae.indexOf('E');
		System.out.printf("E의 위치:%d\n", idx);
		//dae라는 문자열에서 K의 위치 확인 
		idx=dae.indexOf('K');
		System.out.printf("K의 위치:%d\n", idx);		
		
		
		
	}
}
