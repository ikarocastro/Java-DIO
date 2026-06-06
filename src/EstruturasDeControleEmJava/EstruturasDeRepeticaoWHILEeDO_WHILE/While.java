package EstruturasDeControleEmJava.EstruturasDeRepeticaoWHILEeDO_WHILE;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while (true) {
            System.out.println("Informe um nome para o seu nome:");
            name = scanner.next();
            System.out.println(name);
            if (name.equalsIgnoreCase("Exit")) break;

            // Temos tambem o do while

            var Scanner = new Scanner(System.in);
            var nome2 = "";
            do {
                System.out.println("Informe um nome para o seu nome:");
                name = scanner.next();
                System.out.println(name);
                if (name.equalsIgnoreCase("Exit")) break;
            } while (true);
        }
    }
}

/*
A diferença entre While e Do While:

While: Enquanto no while vai verificar se nossa condição e atendida e depois executa-la

Do While: Ele primeiro executa depois faz a verificação, com ele você tem a garantia que seu código irá rodar
pelo menos uma vez, independente se vai atender a condição ou não!

 */