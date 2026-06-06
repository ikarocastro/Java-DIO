package ExercicioPraticaDeFundamentosJava;

import java.util.Scanner;

public class PraticaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        System.out.println("Digite seu nome e o tipo da conta: ");
        System.out.println("Exemplo: João conta corrente");
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1].toLowerCase();

        // TODO: Verifique se o tipo de conta é válido ("corrente", "poupanca" ou "investimento")
        // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.
        switch (tipoConta) {
            case "corrente":
            case "poupanca":
            case "investimento":
                System.out.println(
                        "Bem-vindo(a)," + nome +
                                "! Sua conta " + tipoConta +
                                " está pronta para uso.");

            default:
                System.out.println("Tipo de conta invalido.");
        }
        scanner.close();
    }
}
