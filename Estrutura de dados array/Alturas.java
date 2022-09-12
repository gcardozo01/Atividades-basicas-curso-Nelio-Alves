import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, totMenor16 = 0;
		double soma = 0.0, media = 0.0, percentualMenores = 0.0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				totMenor16++;
			}
			soma += alturas[i];
		}
		media = soma / n;
		percentualMenores = ((double)totMenor16 / n) * 100.0;
		
		System.out.printf("Altura m�dia: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
