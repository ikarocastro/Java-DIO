package operadoresComBitWise;

public class BitWiseOperators_ShiftLeft {
    public static void main(String[] args) {
        var value1 = 9;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 2;
        //var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo numero da operação %s\n", value2);
        var result = value1 << value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s << %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

    }
    /*
    Usamos o operador "<<" ShiftLeft para fazer deslocamento
    0 = false
    1 = true

   9 representado em binário = 1001
   2 = vai ser usado com o ShiftLeft operator
   ele faz o seguinte pra gerar 100100: Ele pegou e empurrou pra esquerda os nosso bits
                                    1001 <--
   So que quando ele desloca esses bits pra esquerda ele acaba deixando dois lugares vazios
                                    1001__
   E o 2 é justamente pra indicar o quanto pra esquerda nossos bits vão
   Mas ele precisa completar esses numeros que estão faltando!
   E para ele completar ele tem que colocar alguma coisa, ele vem e coloca os 0
                                    1001(00)
                                    100100 = 36 dessa forma ele compos o nosso numero 36

    O left Shift empurra pra esquerda e sempre completa com zeros

     */


}
