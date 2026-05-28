package fundamentosLinguagemJava;

import java.util.Scanner;
// colocando o mouse na variavel e apertando alt+enter voce faz um import

public class variveis {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // "new" estamos inicializando nossa variavel para o input,  chamando o Sacanner e passando um argumento
        System.out.println("Digite seu nome: ");
        String name = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Ola " + name + " sua idade é : " + idade);

       
    }
}
