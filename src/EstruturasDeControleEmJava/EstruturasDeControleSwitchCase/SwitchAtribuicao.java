package EstruturasDeControleEmJava.EstruturasDeControleSwitchCase;

import java.util.Scanner;

public class SwitchAtribuicao {
    public static void main(String[] args) {
        var Scanner =  new Scanner(System.in);
        System.out.println("Digite um numero de 1 à 7: ");
        int option = Scanner.nextInt();
        System.out.println("Digite um numero de 1 à 7: ");
        int option2 = Scanner.nextInt();

        var message = switch (option){  // Fazemos uma atribuição de uma variável para o switch!
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Error, Numero invalido";

        };
        System.out.println(message);

        //Podemos tambem fazer uma verificação usando ternário para atribuir o dia do fim de semana!
        var message2 = switch (option2){
            case 1, 7 -> {
                var day = option2 == 1 ? "domingo" : "sabado";
               yield  String.format("Hoje é %s, fim de semana uhulllll!", day); // Fizemo uma interpolação onde pegamos a string e formatamos ela!
            }   // yield é a keyworld de retorno do switchcase para retornar algo dentro da case! quando tem mais de uma linha a gente é obrigado a colocar a keyworld
            case 2 -> "Segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            default -> "Error, Numero invalido";
        };
        System.out.println(message2);
    }
}
