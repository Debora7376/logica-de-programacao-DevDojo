package academy.devdojo.estruturacondicionais;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();
        if (idade >= 18){
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é Adulto");
        }
    }
}
