package academy.devdojo.estruturacondicionais.switchcase;

import java.util.Scanner;

public class Aula02TiposDeContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tipo da sua conta: - 1 para (Conta Poupança) - 2 para (Conta Corrente) - 3 para (Conta Investimento)");
        Integer tipoConta = entrada.nextInt();
        switch (tipoConta) {
            case 1:
                System.out.println("0,05%");
                break;
            case 2:
                System.out.println("0,02%");
                break;
            case 3:
                System.out.println("0,1%");
                break;
            default:
                System.out.println("Tipo de conta invalida");
        }
    }
}
/*
package academy.devdojo.estruturacondicionais.switchcase;

    public static void main(Sting[] args) {
        String conta = "CONTA POUPANÇA";
        switch (conta) {
        case "CONTA POUPANÇA":
            System.out.println("0,05%");
            break;
        case "CONTA CORRENTE":
            System.out.println("0,02%");
            break;
        case "CONTA INVESTIMENTO":
            System.out.println("0,1%")
            break;
            default:
                System.out.println("CONTA INEXISTENTE");
    }
 */