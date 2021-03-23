package academy.devdojo.estruturacondicionais;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();
        if (numero %2 == 0) {
            System.out.println("O numero é Par");
        } else {
            System.out.println("O numero é Impar");
        }
    }
}
