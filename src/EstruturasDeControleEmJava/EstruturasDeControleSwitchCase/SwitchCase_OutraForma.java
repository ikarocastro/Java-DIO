package EstruturasDeControleEmJava.EstruturasDeControleSwitchCase;

import java.util.Scanner;

public class SwitchCase_OutraForma {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 à 7:");
        var option = Scanner.nextInt();
        System.out.println("Digite o numero para sortear um carro aleatório de 1 à 5:");
        var option2 = Scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("segunda");
            case 3 -> System.out.println("terça");
            case 4 -> System.out.println("quarta");
            case 5 -> System.out.println("quinta");
            case 6 -> System.out.println("sexta");
            case 7 -> System.out.println("sabado");
            default -> System.out.println("Error, Numero inválido!");
        }

        switch (option2) {
            case 1 -> System.out.println("honda");
            case 2 -> System.out.println("peugeot");
            case 3 -> System.out.println("chevrolet");
            case 4, 5 -> System.out.println("lamborguini e ferrari! Parabéns"); // aqui temos duas cases em 1 só!
            default -> System.out.println("Error, Numero inválido!");

        }
    }
}