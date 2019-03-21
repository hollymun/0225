
public class Homework {

	public static void main(String[] args) {
		
		
//		0225  - 목요일 수업 
//		1. 정수 데이터 5개를 저장하는 배열을 생성하고 배열의 데이터를 한 줄로 전부 출력 
		
		int [] ar= {5,18,32,26,40};
		for(int sunsue:ar) {
			System.out.printf("%d\t", sunsue);
		}
		
		System.out.printf("\n=======================\n");

//		2. 위 정수 데이터의 합계를 구해서 출력
		int size=ar.length;
		int sum=0;
		for(int i=0; i<size;i=i+1) {
			sum=sum+ar[i];
		}
		System.out.printf("sum: %d\n", sum);
		

//		3. 1부터 1000까지 완전수의 개수를 구해서 출력
//		(완전수: 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
//		6: 1,2,3,6 - 1+2+3=6
//		약수: 나누어 떨어지는 수, 나머지가 없는 수)
		
		//개수를 저장할 변수 
		int cnt = 0; 
		//1부터 1000까지 
		for(int i=1; i<=1000; i=i+1) {
			//약수의 합을 저장할 변수 
			int sum2 = 0;
			for(int j=1; j<=i/2; j=j+1) {
				//약수는 나누어서 나머지가 없는 수 
				if(i % j == 0) {
					sum2 = sum2 + j;
				}
			}
			//자신을 제외한 약수의 합이 자신과 같다면 
			if(i == sum2) {
				System.out.printf("완전수:%d\n", i);
				cnt = cnt + 1; 
			}
		}
		System.out.printf("완전수 개수: %d\n", cnt);
		

		
		
//		4. AOPSOAOAJSSHDKSAOAOAAJSKS 
//		문자열에서 AOA가 있는 곳의 시작 위치를 전부 출력
//		단, 겹치는 부분은 처음 부분 하나만 출력
//		=> 5번째, 14번째 
//		단, java에서는 length()와 charAt(int)만 사용 
		
		String str = "AOPSOAOAJSSHDKSAOAOAAJSKS";
		String msg = "AOA";
		
		int len = str.length();
		
		for(int i=0; i<len-2; i=i+1) {
			//str의 첫 글자 가져오기 
			char start = str.charAt(i);
			//str의 첫 글자와 msg의 첫 글자가 동일하다면 
			if(start == msg.charAt(0)) {
				boolean flag = false;
				//str의 다음 글자와 msg의 다음 글자를 비교 
				for(int j=0; j<3; j=j+1) {
					//서로 다른 글자가 있다면 flag는 true가 됨 
					if(str.charAt(i+j) != msg.charAt(j)) {
						flag = true;
						break;
					}
				}
				//모든 글자가 같은 경우
				if(flag == false) {
					System.out.printf("동일한 패턴의 위치:%d\n", i);
					//현재 패턴을 다음으로 넘기기 위해서 
					i = i + 2; 
				}
			}
		
		}
		

		
		
		
	}
}