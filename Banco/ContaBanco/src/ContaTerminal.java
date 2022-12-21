import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o número da conta: ");
        int Numero = sc.nextInt();

        System.out.println("Digite o número da agência com o dígito: ");
        String Agencia = sc.next();

        System.out.println("Por gentileza digite o seu nome: ");
        String NomeCliente = sc.next();

        System.out.println("Saldo: ");
        Double Saldo = sc.nextDouble();

        System.out.println("Olá " +NomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +Agencia+ ", conta " +Numero+ " e seu saldo " +Saldo+ " já está disponível para saque.");
    }


}
