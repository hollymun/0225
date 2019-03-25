

public class Algo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=0; i<5; i=i+1) {
			//앞 부분의 공백 출력
			for(int j=0; j<4-i; j=j+1) {
				System.out.printf("*");
				}
			for(int j=0; j<2*i+1;j=j+1) {
				System.out.printf("@");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n=====================\n");
			
		for(int i=0; i<5; i=i+1) {
			//앞 부분의 공백 출력
			for(int j=0; j<4-i; j=j+1) {
				System.out.printf(" ");
				}
			for(int j=0; j<2*i+1;j=j+1) {
					System.out.printf("*");
				}
			System.out.printf("\n");
		}		
		
		
		
	}

}
