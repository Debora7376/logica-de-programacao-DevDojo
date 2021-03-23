package academy.devdojo.estruturacondicionais;

import java.util.Scanner;

public class CadastraUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadastre seu usuario:");
        String loginUsuario = entrada.next();
        if (loginUsuario.equals("") || loginUsuario.equalsIgnoreCase("admin") || loginUsuario.equalsIgnoreCase("administrador")){
            System.out.println("Usuario inválido");
        } else {
            System.out.println(loginUsuario + " cadastrado com sucesso");
        }
    }
}
