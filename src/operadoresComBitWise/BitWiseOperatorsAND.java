package operadoresComBitWise;

public class BitWiseOperatorsAND {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo numero da operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 & value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s & %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

    }
    /*
    no caso o operador "&" AND ele retona quando é falso!
    0 = false
    1 = true
    110 = 6
    101 = 5
                     6 =        1 true 1 true 0 false
                     5 =        1 true 0 false 1 true
                                1 true 0 false 0 false
    formando =
    100 = 4
    pois a prefencia é retornar valores falsos!
    */

    // Tudo feito com o operador (AND) "&"
}


