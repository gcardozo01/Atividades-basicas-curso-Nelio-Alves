import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, maisVelho, posicaoMaior;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		maisVelho = idades[0];
		posicaoMaior = 0;
				
		for (int i = 0; i < n; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoMaior]);
		
		sc.close();
	}

}
