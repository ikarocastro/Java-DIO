package operadoresComBitWise;

public class BitWiseOperatorsComplement {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
        var result = ~value1;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" ~%s = %s (representação binária %s)\n", value1, result, binaryResult);
    }

    /*
    O operador "~" Complement funciona como negação ( negando true e negando false)
    0 = false
    1 = true
    6 = 110

    00000000000000000000000000000110
    11111111111111111111111111111001

        se ele retorna 0 que é (false) ele retorna (true) que é verdadeiro e vice versa
        negou o zero e retornou 1

                                    00000110
                                    11111001
                                    tttttfft
    */
}
