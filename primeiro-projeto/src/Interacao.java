import java.util.Scanner;

public class Interacao {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int numero = sc.nextInt();
		
		if(numero% 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
		
	}

}
