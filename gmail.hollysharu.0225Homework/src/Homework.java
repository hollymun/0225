
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
		int su=0;
		int yak=0;
		int perfect=0;
		for(int i=0; i<=1000; i=i+1) {
			
		}

//		4. AOPSOAOAJSSHDKSAOAOAAJSKS 
//		문자열에서 AOA가 있는 곳의 시작 위치를 전부 출력
//		단, 겹치는 부분은 처음 부분 하나만 출력
//		=> 5번째, 14번째 
//		단, java에서는 length()와 charAt(int)만 사용 
		
		String aoa= "AOPSOAOAJSSHDKSAOAOAAJSKS";
		int len=aoa.length();
		for(int i=0; i<len; i=i+1) {
			
		}
		
		
	}
}