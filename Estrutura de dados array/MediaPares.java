import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int totPar = 0;
		int somaPares = 0;
		double mediaPares = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
			
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (nums[i] % 2 == 0) {
				totPar++;
				somaPares += nums[i];
			}
			
		}
		
		
		if (totPar == 0) {
			System.out.println("NENHUM NUMERO E PAR");
		}
		else {
			mediaPares = (double)somaPares / totPar;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		}
		
		sc.close();
	}

}
