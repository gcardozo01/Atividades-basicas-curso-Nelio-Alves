import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] nums = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES =");
		
		for (int i = 0; i < n; i++) {
			System.out.printf(" %.1f", nums[i]);
		}
		
		soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += nums[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nSOMA = %.1f", soma);
		System.out.printf("\nMEDIA = %.1f", media);
		
		sc.close();
	}

}
