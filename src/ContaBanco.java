/**
 * Classe Conta Banco (principal)
 * @author Gabriel Pinto Andrade
 * @version 1.0
 * @since 03/08/2024
 */
public class ContaBanco {

    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.requisitarInformacoes();

        System.out.println(contaTerminal);
    }
}
