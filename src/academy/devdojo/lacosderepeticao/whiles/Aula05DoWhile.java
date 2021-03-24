package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um numero de 1 a 10");
            int num1 = entrada.nextInt();
            System.out.println("PLAYER 2: Digite um numero de 1 a 10");
            int num2 = entrada.nextInt();
            System.out.println("Acetou " + (num1 == num2));
            System.out.println("---------------------------------");
            System.out.println("Deseja Continuar Jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = entrada.nextInt();
        } while (desejaContinuar == 1);
    }
}
