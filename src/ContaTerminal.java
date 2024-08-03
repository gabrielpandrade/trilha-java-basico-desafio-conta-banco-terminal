
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nome_cliente;
    double saldo;
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /**
     * Requisitas as informações da conta
     */
    public void requisitarInformacoes() {

        System.out.println("Insira o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Insira a agência: ");
        agencia = scanner.next();
        System.out.println("Insiar o nome do cliente: ");
        nome_cliente = scanner.next();
        System.out.println("Insiara o saldo: ");
        saldo = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Olá "+this.nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "+this.saldo+"já está disponível para saque";
    }
}
