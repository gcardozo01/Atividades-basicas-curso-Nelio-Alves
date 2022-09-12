import java.util.Scanner;

public class DentroDoIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in  = 0; 
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			int X = sc.nextInt();
			if (X <= 20 && X >= 10) {
				in ++;
			}
			else {
				out ++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
