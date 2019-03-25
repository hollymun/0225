
public class P0322abctri {

	public static void main(String[] args) {

//        A
//      B F
//    C G J
//  D H K M
//E I L N O

/*		
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.printf("*");
			}
			for(int k=0; k<1+i; k=k+1) {
				System.out.printf("@");
			}
			System.out.printf("\n");
		}
*/		
		
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.printf(" ");
			}
			for(int k=0; k<1+i; k=k+1) {
				System.out.printf("@");
			}
			System.out.printf("\n");
		}
		
	}
}
