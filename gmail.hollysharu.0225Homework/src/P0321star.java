
public class P0321star {

	public static void main(String[] args) {
		
		//3. *
		//	 **
		//	 ***
		//	 ****
		//	 *****
/*		
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
*/		

		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.printf(" ");
			}
			for(int k=0; k<1+2*i; k=k+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		
		
	}

}
