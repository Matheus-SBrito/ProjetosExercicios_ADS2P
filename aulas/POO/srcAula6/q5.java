import java.util.Scanner;

public class q5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        String str = input.nextLine(); 
        String inverso = "";


        for (
            int cont = (str.length() - 1), contr = 1;
            cont >= 0; 
            contr ++,
            inverso += str.charAt(cont),
            cont --
        ) if (cont != 0) System.out.println(contr + "° Construção da inversão: " + inverso);

        System.out.println("Resultado Final: " + inverso);
    }

}
