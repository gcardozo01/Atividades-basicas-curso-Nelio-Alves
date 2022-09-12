import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
		double maiorNum;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double nums[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextDouble();
		}
		
		maiorNum = nums[0];
		posMaior = 0;
		
		for (int i = 1; i < n; i++) {
			if (nums[i] > maiorNum) {
				maiorNum = nums[i];
				posMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maiorNum);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);
		
		sc.close();
	}

}
