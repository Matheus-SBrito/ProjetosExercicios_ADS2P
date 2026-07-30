import java.util.Scanner;

public class ExemploScanner {
	
	public static void main (String[] args) {
		
		int n1, n2, n3;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite um primeiro número: ");
		n1 = input.nextInt();
		
		System.out.println("Digite um segundo número: ");
		n2 = input.nextInt();
		
		System.out.println("Digite um terceiro número: ");
		n3 = input.nextInt();
		
		
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		input.close();
		
	}

}
