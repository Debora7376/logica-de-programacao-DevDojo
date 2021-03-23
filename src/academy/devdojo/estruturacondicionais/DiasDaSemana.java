package academy.devdojo.estruturacondicionais;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        Integer dia = entrada.nextInt();

        if (dia == 1) {
            System.out.println("O dia da semana é: Domingo");
        } else if (dia == 2) {
            System.out.println("O dia da semana é: Segunda-Feira");
        } else if (dia == 3) {
            System.out.println("O dia da semana é: Terça-Feira");
        } else if (dia == 4) {
            System.out.println("O dia da semana é: Quarta-Feira");
        } else if (dia == 5) {
            System.out.println("O dia da semana é: Quinta-Feira");
        } else if (dia == 6) {
            System.out.println("O dia da semana é: Sexta-Feira");
        } else if (dia == 7) {
            System.out.println("O dia da semana é: Sabado");
        } else {
            System.out.println("Número invalido");
        }
    }
}
