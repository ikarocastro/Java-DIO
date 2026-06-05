package EstruturasDeControleEmJava.EstruturaDeReticaoFOR;

import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {
        var Scanner =  new Scanner(System.in);
        // for = (Var de inicialização; variavel de controle; incremento)
        for (int i = 0; i < 3; i++){
            System.out.println("Digite um nome:");
            var name = Scanner.next();
            if(name.equalsIgnoreCase("exit"))break;
            // Para trabalhar com String em parametro não podemos usar o sinal de == temos que usar o (equals, o (IgnoreCase) para pegar independente de caixa alta ex: EXIT ou exit ou Exit)
            // e isso chama o break que é nosso stop para o loop
            System.out.println(name);
        }
        // outro FOR para imprimir numeros de 1 à 100
        for (int j = 0; j <= 100; j++){
            if (j == 100){
                System.out.println("Fim da execução!");
                break; // se o J for igual a 100 ele parará a execução do loop
            }
            System.out.println(j); // passamos como parametro nosso indice "j"
        }
        // Podemos incrementar de 2 em 2 até 100
        for (int l = 0; l <= 100; l+=2){
            if (l == 100){
                System.out.println("Fim do loop de 2 em 2");
                break;
            }
            System.out.println(l);
        }
        // Podemos tambem fazer em ordem decrescente!
        for (int k = 200; k >= 0; k--){
            if (k == 0){
                System.out.println("Fim do loop decrescente!");
                break;
            }
            System.out.println(k);
        }
        // Podemos verficar somente os numeros impares usando a keyworld "continue"
        for (int p = 0; p <= 100; p++){
            if (p % 2 == 0){
                System.out.println("Numero é impar!");
            }
            System.out.println(p);
        }
    }
    /*
    int = 1; Nossa variavel que interage com o fluxo
    i < 10; determina até quando o loop vai ser rodado

    */
}
