import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String novoFormato = 
        str.toUpperCase(
            ).replace("A", "4"
                ).replace("E", "3"
                    ).replace("O", "0"
                        ).replace("I", "1");

        System.out.println("Antigo formato: " + str + " | Novo Formato: " + novoFormato);

    }
    
}
