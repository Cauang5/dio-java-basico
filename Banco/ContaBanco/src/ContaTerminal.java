import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o número da conta: ");
        Numero = sc.nextInt();

        System.out.println("Digite o número da agência com o dígito: ");
        Agencia = sc.nextLine();

        System.out.println("Por gentileza digite o seu nome: ");
        NomeCliente = sc.nextLine();

        System.out.println();

    }


}
