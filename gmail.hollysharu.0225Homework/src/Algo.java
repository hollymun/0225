

import java.util.Scanner;

public class Algo {

//6.
//   1
// 2   3
//4     5
//6789012
	///////
	//
	
	public static void main(String[] args) {
		int idx=1;
	for(int i=0; i<5; i=i+1) {
		//앞 부분의 공백 출력
		for(int j=0; j<4-i; j=j+1) {
			System.out.printf(" ");
			}
		//뒷부분 만들기 
		//2-4번째 줄까지 
		if(i!=0 && i!=4) {
			System.out.printf("%d", idx%10);
			idx=idx+1;
			for(int j=0; j<2*i-1;j=j+1) {
				System.out.printf(" ");
			}
			System.out.printf("%d", idx%10);
			idx=idx+1;
		}
		//첫 번째와 마지막 줄 
		else {
			//1 3 5 7
			for(int j=0; j<2*i+1; j=j+1) {
				System.out.printf("%d", idx%10);
				idx=idx+1;
				}
		}
		
		System.out.printf("\n");
		}
	
	System.out.printf("\n\n======================================\n");
	System.out.printf("======================================\n\n");


	int [][] ar= {{10,20,30},{40,50,60},{70,80,90}};

	/* 
		10 20 30
		40 50 60 
		70 80 90 

		[0][0] [0][1] [0][2]
		[1][0] [1][1] [1][2]
		[2][0] [2][1] [2][2] 
	
	*/   
	
		for(int i=0; i<3; i=i+1) {
			for(int j=0; j<3; j=j+1) {
				System.out.printf("%d\t", ar[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n\n======================================\n\n");
	
		
		for(int i=0; i<3; i=i+1) {
			int rowSum=0;
			int colSum=0;
			for(int j=0; j<3; j=j+1) {
				rowSum=rowSum+ar[i][j];
				colSum=colSum+ar[j][i];
			}
			System.out.printf("%d번 행의 합계: %d\n", i,rowSum);
			System.out.printf("%d번 열의 합계: %d\n", i,colSum);
		}
		
		
		System.out.printf("\n\n======================================\n");
		System.out.printf("======================================\n\n");

		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("연도:");
		int year=sc.nextInt();
		System.out.printf("월: ");
		int month=sc.nextInt();
		
		//입력한 연도까지 전까지 날짜 수 총합계 
		int cnt=0;
		for(int i=1; i<year; i=i+1) {
			//윤년인지 확인
			if(i%4==0 && i%100!=0 || i%400==0) {
				//윤년이면 366일 더하기 
				cnt=cnt+366;
			}
			//윤년이 아니라면 
			else {
				cnt=cnt+365;
			}
		}
		//System.out.printf("이전 날의 합계:%d\n", cnt);
		//System.out.printf("합계를 요일 수로 나누기:%d\n", cnt%7);
		
		//입력한 월까지 지나온 날 수를 추가 
		//각 월의 날수를 배열에 저장해두면 반복문을 사용할 수 있음
		//배열을 만들 때 처음부터 데이터를 저장하면 반복문 사용하는 것이 불편할 수 있음
		//첫 번째 데이터는 버리고 두 번째부터 데이터를 저장하는 것이 편리 
		
		int [] nalsu= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//윤년이면 2월의 날 수가 29일 
		if(year%4==0 && year%100!=0 || year%400==0) {
			nalsu[2]=29;
		}
		
		for(int i=0; i<month; i=i+1) {
			cnt=cnt+nalsu[i];
		}
		
		//입력한 월의 1일의 요일 
		//System.out.printf("%d\n", (cnt%7+1));

		//배열에 일을 추가
		//전부 0으로 초기화 
		int [] calendar = new int[42];
		int k=cnt%7+1;	//다음 달로 넘어가야... 
		for(int i=0; i<nalsu[month]; i=i+1) {	
			calendar[k+i]=i+1;
		}
/*		
		for(int i=0; i<calendar.length; i=i+1) {
			System.out.printf("%d\n", calendar[i]);
		}
*/		
		//달력 출력
		System.out.printf("  일 월  화  수 목  금 토\n");
		for(int i=0; i<calendar.length; i=i+1) {
			//0일 때는 공백 출력 
			if(calendar[i]==0) {
				System.out.printf("   ");
			}
			//0이 아닐 때는 값을 출
			else {
				System.out.printf("%3d", calendar[i]);
			}
			//7번마다 줄바꿈 
			if(i%7==6) {
				System.out.printf("\n");
			}
		}
		
		
		
		sc.close();
	
	
 	}
}
