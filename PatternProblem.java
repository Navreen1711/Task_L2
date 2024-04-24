package task_2;

public class PatternProblem {

	public static void main(String[] args) {
		char ch='F';
		int n=(int)ch-65;
		
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=n;j++) {
				if(i+j==n) {
					System.out.print((char)(65+i));
				}
				else
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print((char)(65+i));
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		int k=0;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=k;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(i+j==n-1) {
					System.out.print((char)(65+i));
				}
				else
				System.out.print(" ");
			}
			for(int j=1;j<n;j++) {
				if(i==j) {
					System.out.print((char)(65+i));
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
