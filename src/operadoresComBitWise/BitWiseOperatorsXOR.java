package operadoresComBitWise;

public class BitWiseOperatorsXOR {
    public static void main(String[] args) {
            var value1 = 6;
            var binary1 = Integer.toBinaryString(value1);
            System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
            var value2 = 5;
            var binary2 = Integer.toBinaryString(value2);
            System.out.printf("Segundo numero da operação %s (representação binária %s)\n", value2, binary2);
            var result = value1 ^ value2;
            var binaryResult = Integer.toBinaryString(result);
            System.out.printf("%s ^ %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        }
    /*
    no caso o operador "^" XOR ele irá comparar cada Bit ou seja (se os numeros forem iguais ele retorna 0, se forem diferentes ele retorna 1)
    0 = false
    1 = true
    110 = 6
    101 = 5
                     6 =        1 true 1 true 0 false
                     2 =        1 true 0 false 1 true
                     3 =        0 false 1 true 1 true
    011 = 3
    */

        // Tudo feito com o operador (XOR) "^"
}



