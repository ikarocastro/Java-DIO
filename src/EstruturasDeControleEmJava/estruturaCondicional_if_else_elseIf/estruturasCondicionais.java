package EstruturasDeControleEmJava.estruturaCondicional_if_else_elseIf;

import java.util.Scanner;

public class estruturasCondicionais {
    public static void main(String[] args) {
        //usamos essas estruturas para validações com base em bools, se for true executa um código se false outro

        var scn = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scn.next(); //"scn.next" usamos para capturar a entrada do usuário!
        System.out.println("Informe sua idade: ");
        var  age = scn.nextInt();
        System.out.println("Voce é emancipado? (s/n)");
        var isEmancipated = scn.next().equalsIgnoreCase("s");
        //equalsIgnoreCase = se ele digitar s maiusculo ou minusculo ele irá retornar verdadeiro do mesmo jeito, se não ele retorna false!

        if (age >= 18) {
            System.out.println("bem vindo");
            System.out.printf("%s, voce tem %s anos, voce pode dirigir!\n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s voce apesar de não ter %s anos, voce pode dirigir!\n", name, age);
        } else{
            System.out.printf("%s voce tem %s anos, nao pode dirigir!\n", name,  age);
        }
        System.out.println("Fim do programa!");
    }
}
