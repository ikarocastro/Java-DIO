package operadoresAtribuicaoELogicos;
import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é sua idade? ");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado? ");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated;
        System.out.printf("Voce pode dirigir? (%s) \n", canDrive);
        if (age > 18 || isEmancipated) {
            System.out.println("Voce pode dirigir!");
        } else if (age < 18) {
            System.out.println("Voce não pode dirigir!");
        }
    }
}
// parei no video no minuto 18:23
//isRigth é bool para false se errar! e true se acerta!
// isWrong é bool invertido

//operadores

// > significa (maior que)
// < significa (menor que)
// == significa (igual à)
// != significa (diferente de)
// >= significa (maior ou igual à)
// <= significa (menor ou igual à)