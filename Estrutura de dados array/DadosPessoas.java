import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int totMulheres = 0;
		int totHomens = 0;
		double maiorAltura = 0.0;
		double menorAltura = 0.0;
		double somaAlturaMulheres = 0.0;
		double mediaAlturaMulheres = 0.0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			generos[i] = sc.next().charAt(0);
			System.out.println();
		}
		
		maiorAltura = alturas[0];
		menorAltura = alturas[0];
		
		for (int i = 0; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas [i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'F') {
				totMulheres++;
				somaAlturaMulheres += alturas[i]; 
			}
			else {
				totHomens++;
			}
		}
		
		mediaAlturaMulheres = somaAlturaMulheres / totMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d\n", totHomens);
		
		sc.close();
	}

}
