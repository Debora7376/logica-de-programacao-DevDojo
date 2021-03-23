package academy.devdojo.estruturacondicionais.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu sexo : ");
        String sexo = entrada.next();
        System.out.println("Digite sua idade: ");
        Integer idade = entrada.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("academy.devdojo.estruturacondicionais.ifelse.Alistamento Obrigatorio");
        } else if ((sexo.equalsIgnoreCase("M") && idade < 18) || (sexo.equalsIgnoreCase("F") && idade < 18)) {
            System.out.println("academy.devdojo.estruturacondicionais.ifelse.Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Deseja se alistar? ");
        }
    }
}
