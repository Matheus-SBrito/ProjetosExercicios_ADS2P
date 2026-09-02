package aulas.POO.listas.semana5;

import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        ContaCorrente conta = new ContaCorrente();
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do{

            if (opcao == 0)
                System.out.println("Ecolha uma opção valida.");

            System.out.println(
                "Opções:"+ 
                "\n1 - cadastrar uma conta"+
                "\n2 - consultar o saldo de uma conta" +
                "\n3 - sair"
            );
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    
                    conta.setSaldo(input.nextFloat());
                    conta.setNumero(input.nextLine());
                    conta.setTitular(input.nextLine());

                    if (banco.salvarConta(conta))
                        System.out.println("Operação realiza com sucesso.");
                    else
                        System.out.println("Operação falhada.");
                    conta = null;
                    
                    break;

                case 2:
                    System.out.println("Digite o numero de sua conta, para consulta do saldo:");
                    conta = banco.recuperarConta(input.nextLine());

                    if (conta != null)
                        System.out.println("Saldo: " + conta.getSaldo());
                    else
                        System.out.println("Conta inexistente.");
            
                default:
                    break;
            }


        } while (opcao == 3);

        input.close();

    }
}
