package operadoresComBitWise;

public class BitWiseOperators_signedRightShift {
    public static void main(String[] args) {
            var value1 = -8;
            var binary1 = Integer.toBinaryString(value1);
            System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
            var value2 = 2;
            //var binary2 = Integer.toBinaryString(value2);
            System.out.printf("Segundo numero da operação %s\n", value2);
            var result = value1 >> value2;
            var binaryResult = Integer.toBinaryString(result);
            System.out.printf("%s >> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        }

         /*
            Usamos o operador ">>" SignedRigthShift desloca os numeros para a direita parecido com o LeftShift
            0 = false
            1 = true

            8 representado em binário= 1000
            dessa vez com o operador >> empurramos o numero duas casas a direita
                                    -->1000
            quando é empurrado ele deixa 2 espaços vazios determinado pelo numero 2 e os zeros são descartados
                                     __10
                                     ele completa a esquerda com zeros
                                     0010
                                     e como zero não representa nada ele não imprime e deixa o 10 gera o numero 2


            Se colocarmos um numero negativo como o -8 teremos 11111111111111111111111111111000
            que representa o -2 : 11111111111111111111111111111110

            O rigth ele verifica se o ultimo numero a esquerda é positivo ou negativo
            se for 0 = negativo então vou completar com o numero 1
            se for 1 = positivo então vou completar com o numero 0 a minha esquerda
            essa é a diferença entre o Rigth Shift sobre o Left Shift

            O rigth Shift empurra pra direita e vai sempre verificar a é negativo ? completo com numero 1
            e positivo então completo com numero 0


         */


}

