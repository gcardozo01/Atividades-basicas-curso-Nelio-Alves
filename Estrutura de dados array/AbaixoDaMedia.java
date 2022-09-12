import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0.0;
		double media = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] nums = new double[n];
		
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			soma += nums[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMEDIA DO VETOR %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < n; i++) {
			if (nums[i] < media) {
				System.out.printf("%.1f\n", nums[i]);
			}
		}
		
		sc.close();
	}

}
