package EstruturasDeControleEmJava.EstruturasDeControleExercicios;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 1 Tabuada
        var Scanner = new Scanner(System.in);
        System.out.println("Entre com um numero para gerar a tabuada de 1 até 10:");
        int number = Scanner.nextInt();

        System.out.println("A tabuada do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Exercicio 2
        System.out.println("Qual sua altura? ");
        double altura = Scanner.nextDouble();
        System.out.println("Qual seu peso atual? ");
        double peso = Scanner.nextDouble();
        double calculoIMC;

        calculoIMC = peso / (altura * altura);
        System.out.println("Seu IMC é: " + calculoIMC);

        System.out.println("Resultado = " + calculoIMC);

        double resultadoIMC = calculoIMC;
        if (resultadoIMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (resultadoIMC >= 18.5 && resultadoIMC <= 24.9) {
            System.out.println("Peso ideial");
        } else if (resultadoIMC >= 25 && resultadoIMC <= 29.9) {
            System.out.println("Levemente acima do peso!");
        } else if (resultadoIMC >= 30 && resultadoIMC <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (resultadoIMC >= 35 && resultadoIMC <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else if (resultadoIMC >= 40 && resultadoIMC <= 49.9) {
            System.out.println("Obesidade grau III (Mórbida!!)");
        } else {
            System.out.println("Resultado incorreto!");
        }

        // Exercicio 3

        System.out.println("Digite o primeiro numero:");
        int num1 = Scanner.nextInt();
        int num2;
        do {
            System.out.println("Digite o segundo numero (Deve ser maior que " + num1 + "):");
            num2 = Scanner.nextInt();

            if (num2 <= num1) {
                System.out.println("O segundo numero não pode ser igual nem menor que o primeiro!");
            }

        } while (num2 <= num1);

        int opcao;
        do {
            System.out.println("Escolha o tipo:");
            System.out.println("  1 - Pares");
            System.out.println("  2 - Ímpares");
            System.out.print("Sua opção: ");
            opcao = Scanner.nextInt();

            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida. Digite 1 ou 2.");
            }
        } while (opcao != 1 && opcao != 2);

        // --- EXIBIÇÃO DOS RESULTADOS ---
        String tipo = (opcao == 1) ? "pares" : "ímpares";
        System.out.println("\nNúmeros " + tipo + " entre " + num1 + " e " + num2 + " (ordem decrescente):");

        boolean encontrou = false;

        for (int i = num2; i >= num1; i--) {
            boolean ehPar = (i % 2 == 0);

            if (opcao == 1 && ehPar) {
                System.out.print(i + " ");
                encontrou = true;
            } else if (opcao == 2 && !ehPar) {
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum número encontrado nesse intervalo.");
        } else {
            System.out.println();
        }

        Scanner.close();

        // Exercicio 4

        System.out.println("Digite o número inicial: ");
        int base = Scanner.nextInt();

        System.out.println("Digite os próximos números (o programa para quando o resto for diferente de 0):");

        int contador = 0;

        while (true) {
            int numero = Scanner.nextInt();

            // Ignora números menores que a base
            if (numero < base) {
                System.out.println("  [ignorado: " + numero + " é menor que " + base + "]");
                continue;
            }

            int resto = numero % base;

            if (resto != 0) {
                System.out.println("Parou em " + numero + " — resto da divisão por " + base + " é " + resto + ".");
                System.out.println("Total de números válidos processados: " + contador);
                break;
            }

            contador++;
            System.out.println("  " + numero + " ÷ " + base + " = " + (numero / base) + " (resto 0) ✓");
        }
        Scanner.close();
    }
}




/*


    1) Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número; (CONCLUIDO!)

    2) Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
    e seja exibida a mensagem de acordo com o resultado: (CONCLUIDO!)

    Se for menor ou igual a 18,5 "Abaixo do peso";
    se for entre 18,6 e 24,9 "Peso ideal";
    Se for entre 25,0 e 29,9 "Levemente acima do peso";
    Se for entre 30,0 e 34,9 "Obesidade Grau I";
    Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
    Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

    3) Escreva um código que o usuário entre com um primeiro número,
     um segundo número maior que o primeiro e escolhe entre a opção par e impar,
     com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
     incluindo os números informados e em ordem decrescente; (CONCLUIDO!)

    4) Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
     a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
     números menores que o primeiro número devem ser ignorados





*/