import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextInt();
			}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < n; i++) {
			if (nums[i] < 0) {
				System.out.println(nums[i]);
			}
			
		}
		
		sc.close();
	}

}
