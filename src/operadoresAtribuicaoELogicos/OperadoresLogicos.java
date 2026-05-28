package operadoresAtribuicaoELogicos;
import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é sua idade? ");
        var age = scanner.nextInt();
        var canDrive = age >= 18;
        System.out.printf("Voce pode dirigir? (%s) \n", canDrive);
        if (age > 18) {
            System.out.println("Voce pode dirigir!");
        } else if (age < 18) {
            System.out.println("Voce pode não dirigir!");
        }
    }
}

//isRigth é bool para false se errar! e true se acerta!
// isWrong é bool invertido