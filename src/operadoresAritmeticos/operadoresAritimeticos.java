package operadoresAritmeticos;

import java.util.Scanner;

public class operadoresAritimeticos {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        var value1 = Scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        var value2 = Scanner.nextInt();
        System.out.println("O resultado é = " + (value1 + value2));

        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:\n");
        var value3 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n ", value3, Math.sqrt(value3));
    // Math. sqrt é uma class Math com o sqrt que trabalha com retorno double

        var scanner2 = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:\n");
        var value4 = scanner.nextInt();
        System.out.printf("A potencia de %s é %s\n", value4, Math.pow(value4, 2));
    // Math. é da class math e o pow trabalha com potências

        var scanner3 = new Scanner(System.in);
        var value5 = 50;
        System.out.println(10 + value5 ++);
        System.out.println(10 + value5);
    // Aqui fizemos o incremento ++ acrescentando o valor a value5 como += 1 ou value5 = value5 +1
    }

}
