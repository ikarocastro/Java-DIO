package ExerciciosFundamentosDeJava;

import java.util.Scanner;

public class ExerciciosJava {
    public static void main(String[] args) {

        // Desafio 1
        var Scanner =  new Scanner(System.in);
        System.out.println("Digite Seu nome: ");
        var name = Scanner.nextLine();
        System.out.println("Digite sua idade: ");
        var age = Scanner.nextInt();
        System.out.println("Ola " + name + " você tem  " + age + " anos");


        // Desafio 2
        double Area;
        var Scanner1 = new Scanner(System.in);
        System.out.println("Tamanho do lado do quadrado: ");
        double Lado = Scanner.nextDouble();
        double area = Lado * Lado;
        var result = String.format("%.2f", area);
        System.out.println("Resultado: \n" + result);



        // Desafio 3
        double base, altura;
        double area1 = area;

        var Scanner2 = new Scanner(System.in);
        System.out.println("Tamanho da Altura : ");
        altura = Scanner.nextInt();
        System.out.println("Tamanho da Base: ");
        base = Scanner.nextDouble();
        area1 = area =  base * altura;
        System.out.println("Resultado: \n" + area1);



        // Desafio 4
        var scanner1 = new Scanner(System.in);

        // Pessoa 1
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = Scanner.next();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = Scanner.nextInt();

        // pessoa 2
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = Scanner.next();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = Scanner.nextInt();

        // calcular a diferença
        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 +
                " e " + nome2 + " é de " +
                diferenca + " anos.");


    }
    /*
            Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

            Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

            fórmula: área=lado X lado

            Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

            fórmula: área=base X altura

            Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

            */
}
