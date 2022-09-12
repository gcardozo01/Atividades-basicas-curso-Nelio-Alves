import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, totPar = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digte um numero: ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		for (int i = 0; i < n; i++) {
			if (nums[i] % 2 ==0) {
				totPar++;
				System.out.printf("%d ", nums[i]);
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", totPar);
		sc.close();
	}

}
