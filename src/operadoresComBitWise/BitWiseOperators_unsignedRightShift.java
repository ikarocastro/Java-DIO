package operadoresComBitWise;

public class BitWiseOperators_unsignedRightShift {
    public static void main(String[] args) {
        var value1 = 12;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 2;
        //var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo numero da operação %s\n", value2);
        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

    }

         /*
            Usamos o operador ">>>" UnsignedRigthShift desloca os numeros para a direita funcionando igual o nosso
            LeftShift Operator
            0 = false
            1 = true

                Ele pegou o 12 com representação binária = 1100
                    empurrou duas posições para a direita __1100
                        e os zeros do começo foram descartados e completou com zeros a direita
                                            0011
                                como zeros a esquerda não representam nada temos o = 11

         */


}
