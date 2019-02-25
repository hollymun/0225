
public class sort {

	public static void main(String[] args) {

		
		//Bubble Sort 
		int [] ar= {30,40,50,10,20};
		int size=ar.length;
		//최대 n-1 회전하는 동안 
		for(int i=0; i<size-1; i=i+1) {
			//위치 이동을 확인하기 위한 변수 
			int flag=0;
			//-i+3 => 4-i => size-1-i 
			for(int j=0; j<size-1-i; j=j+1) {
				//본인(j)보다 다음 거가 더 클 때 위치변경 
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					//위치 이동이 있으면 값 변경 
					flag=1;
				}
			}
			//위치 이동이 없었다면 종료 
			if(flag==0) {break;}

			//중간 결과를 출력 
			for(int imsi:ar) {
				System.out.printf("%d\t", imsi);
				}
			System.out.printf("\n");
		}
		
		System.out.printf("======================\n");

		for(int imsi:ar) {
			System.out.printf("%d\t", imsi);
			}
		System.out.printf("\n");
	
		
		
		System.out.printf("======================\n");
		
		String [] names= {"하루","박시","후추","호두","나루", "얌마"};
		int len=names.length;
		for(int i=0; i<len-1; i=i+1) {
			int flag=0;
			for(int j=0; j<len-1-i; j=j+1) {
				if(names[j].compareTo(names[j+1])>0) {
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
					flag=1;
				}
				for(String imsi:names) {
					System.out.printf("%s\t", imsi);
				}
				System.out.printf("\n");

			}
			if(flag==0) {
				break;
			}
		}
		System.out.printf("\n");
		for(String imsi:names) {
			System.out.printf("%s\t", imsi);
		}
		
	
	}
}
