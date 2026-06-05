package EstruturasDeControleEmJava.EstruturasDeControleSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7:");
        var option = scanner.nextInt(); // input para o user digitar somente um numero inteiro!
        switch (option) {
            case 1:
                System.out.println("sabado");
                break;
                case 2:
                    System.out.println("domingo");
                    break;
                    case 3:
                        System.out.println("segunda");
                    break;
                    case 4:
                        System.out.println("terça");
                        break;
                        case 5:
                            System.out.println("quarta");
                            break;
                            case 6:
                                System.out.println("quinta");
                                break;
                                case 7:
                                    System.out.println("sexta");
                                    break;
            default:
                System.out.println("erro, Opção inválida!");
        }
    }
}
